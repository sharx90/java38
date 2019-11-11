package FoodManager;

import java.util.Scanner;

public class Client {
    private Scanner input = new Scanner(System.in);

    private Manager manager = new Manager();
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
    public void run(){
        boolean run = true;
        while (run) {
            System.out.println("*****************食品管理系统*****************");
            System.out.println("1.添加食品");
            System.out.println("2.根据食品名称,查询食品");
            System.out.println("3.根据食品名称,修改食品价格");
            System.out.println("4.计算所有食品总价");
            System.out.println("5.统计所有食品中最贵的商品信息");
            System.out.println("6.按照食品的价格升序排序输出这些食品的信息");
            System.out.println("7.根据食品名称删除食品信息");
            System.out.println("8.退出");
            System.out.println("请选择你要执行的功能编号:");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    addFood();
                    break;
                case 2:
                    findByName();
                    break;
                case 3:
                    updatePrice();
                    break;
                case 4:
                    totalMoney();
                    break;
                case 5:
                    getMaxMoneyFood();
                    break;
                case 6:
                    sortByPrice();
                    break;
                case 7:
                    deleteFood();
                    break;
                case 8:
                    run = false;
                    break;
                default:
                    System.out.println("请输入正确的序号");
            }
        }
    }

    /**
     * 添加食品方法
     */
    public void addFood(){
        System.out.println("请输入食品名称:");
        String name = input.next();
        System.out.println("请输入食品价格:");
        double price = input.nextDouble();
        System.out.println("请输入食品数量:");
        int count = input.nextInt();

        Food food = new Food(name, price, count);
        boolean flag = manager.addFood(food);
        System.out.println(flag ? "添加成功" : "添加失败");
    }

    /**
     * 通过食品名称查询食品
     */
    public void findByName(){
        System.out.println("请输入食品名称:");
        String name = input.next();

        Food food = manager.findByName(name);
        if (food == null){
            System.out.println("查无此食品");
        }else {
            System.out.println(food);
        }
    }

    /**
     * 修改食品价格
     */
    public void updatePrice() {
        System.out.println("请输入食品名称:");
        String name = input.next();
        System.out.println("请输入新的食品价格:");
        double price = input.nextDouble();

        if (manager.findByName(name) == null) {
            System.out.println("查无此商品");
        } else {
            boolean flag = manager.updatePrice(name, price);
            System.out.println(flag ? "修改成功" : "修改失败");

        }
    }

    /**
     * 计算总价格
     */
    public void totalMoney(){
        double totalMoney = manager.totalMoney();
        System.out.println("总价是:" + totalMoney);
    }

    /**
     * 排列Food[]数组
     * @param food
     */
    private void arraysFood(Food[] food) {
        if (food == null){
            System.out.println("暂无库存信息");
            return;
        }else {
            System.out.println("食品\t\t价格\t\t数量" );
            for (int i = 0; i < food.length; i++) {
                System.out.println(food[i].getName() + "\t\t" + food[i].getPrice() +"\t\t" + food[i].getCount());
            }
        }
    }
    /**
     * 找出最大价格的食品
     */
    public void getMaxMoneyFood(){
        Food[] food = manager.getMaxMoneyFood();
        arraysFood(food);
    }

    /**
     * 按食品价格进行排序
     */
    public void sortByPrice(){
        Food[] food = manager.sortByPrice();
        arraysFood(food);
    }

    public void deleteFood(){
        System.out.println("请输入需要删除的食品名称:");
        String name = input.next();

        boolean flag = manager.deleteFood(name);
        System.out.println(flag ? "删除成功" : "没有此商品");
    }

}

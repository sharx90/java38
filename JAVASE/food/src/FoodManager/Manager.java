package FoodManager;

import java.util.Arrays;

public class Manager {
    private final int INIT_CAPBILITY = 100;
    //定义一个food类长度为100的数组;
    private Food[] foods = new Food[INIT_CAPBILITY];
    //统计食品数量
    int size = 0;
    /**
     * 新增食品方法
     * @param food
     * @return
     */
    public boolean addFood(Food food){
        Food byName = this.findByName(food.getName());
        if (byName == null){
            if (size + 1 >INIT_CAPBILITY){//超出数组范围
                return false;//返回新增失败
            }
            foods[size++] = food;
        }else {
            byName.setCount(byName.getCount() + food.getCount());
        }
        return true;
    }

    /**
     * 根据名字查询食品方法
     * @param name
     * @return
     */
    public Food findByName(String name){
        for (int i = 0; i < size; i++) {
            Food food = foods[i];
            if (food != null && food.getName().equals(name)){
                return food;
            }
        }
        return null;
    }
    /**
     * 根据名称修改价格
     * @param name
     * @return
     */
    public boolean updatePrice(String name,double price){
        Food byName = this.findByName(name);//查询是否有此名字的食品
        if (byName == null)
            return false;
        else
            byName.setPrice(price);
        return true;
    }

    /**
     * 算总价
     * @return
     */
    public double totalMoney(){
        double totalMoney = 0;
        for (int i = 0; i < size; i++) {
           double money = foods[i].getCount() * foods[i].getPrice();
           totalMoney +=money;
        }
        return totalMoney;
    }

    /**
     * 统计最贵的商品信息
     * @return
     */
    public Food[] getMaxMoneyFood(){
        Food[] maxfoods = null;
        if (size == 0){
            return null;//当数组长度为0时,没有最大
        } else if (size == 1){
            maxfoods = new Food[size];//当数组长度为1时,他就是最大
            maxfoods[size - 1] = foods[size - 1];
        }else {
            double max = foods[0].getPrice();
            for (int i = 1; i < size - 1; i++) {
                if (foods[i].getPrice() > max) {
                    max = foods[i].getPrice();
                }
            }
            int a = 0;
            for (int i = 0; i < size; i++) {
                if (foods[i] != null && foods[i].getPrice() == max)
                    a++;
            }
            maxfoods = new Food[a];
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (foods[i] != null && foods[i].getPrice() == max){
                    maxfoods[index] =foods[i];
                    index++;
                }
            }
        }
        return maxfoods;
    }
    /**
     * 按照食品的价格升序排序输出这些食品的信息
     */
    public Food[] sortByPrice(){
        if (foods == null)return null;
        Food[] foods = Arrays.copyOf(this.foods,this.size);
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (foods[j].getPrice() > foods[j+1].getPrice()){
                    Food target = foods[j];
                    foods[j] = foods[j + 1];
                    foods[j + 1] = target;
                }
            }
        }
        return foods;
    }
    /**
     * 根据食品名称删除食品信息（注意，被删除元素之后的元素要补位）
     */
    public boolean deleteFood(String name){
        Food byName = this.findByName(name);
        if (byName == null)return false;
        int a = 0;
        for (int i = 0; i < size; i++) {
            if (byName == foods[i])
                a = i;
        }
        System.arraycopy(foods,a + 1, foods, a, size - a - 1);
        /*for (int i = 0; i < size; i++) {
            if (i == a){
             foods[i] = foods[i+1];
             a = i+1;
            }
        }*/
        foods[size] = null;
        size -= 1;
        return true;
    }
}

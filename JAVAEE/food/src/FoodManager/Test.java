package FoodManager;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Food food1 = new Food("牛肉干",10,5);
        Food food2 = new Food("豆腐干",2,10);
        Food food3 = new Food("鱿鱼干",8,12);
        Food food4 = new Food("猪肉脯",15,2);
        Food food5 = new Food("葡萄干",5,15);
        Food food6 = new Food("泡椒凤爪",15,5);
        manager.addFood(food1);
        manager.addFood(food2);
        manager.addFood(food3);
        manager.addFood(food4);
        manager.addFood(food5);
        manager.addFood(food6);
        boolean flag = manager.deleteFood("鱿鱼干");
        System.out.println(flag);
        Food[] food = manager.sortByPrice();
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
    }
}

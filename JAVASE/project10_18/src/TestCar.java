public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "宝马";
        car.color = "白色";
        car.price = 1000000;

        String brand = car.brand;
        String color = car.color;
        int price = car.price;
        System.out.println("品牌:"+brand);
        System.out.println("颜色:"+color);
        System.out.println("价格:"+price);


    }
}

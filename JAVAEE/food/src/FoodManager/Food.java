package FoodManager;

public class Food {
    private String name;
    private double price;
    private int count;

    public Food(){

    }
    public Food(String name,double price,int count){
        this.name = name;
        this.price = price;
        this.count =count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price < 0)price = 0;
        this.price = price;
    }

    public double getPrice() { return price; }

    public void setCount(int count) {
        if (count < 0)count = 0;
        this.count = count;
    }

    public int getCount() {
        return count;
    }


    @Override
    public String toString() { return "name：" + this.name + ",price：" + this.price + "，count：" + this.count; }
}

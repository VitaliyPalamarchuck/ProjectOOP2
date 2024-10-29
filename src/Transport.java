import java.util.Scanner;
public abstract class Transport implements MotorBike{
    protected String name;
    protected int horsePower;
    protected int height;
    protected int tankCapacity;
    protected int price;
    protected String category;
    // Конструктор для ініціалізації параметрів мотоцикла
    public Transport(String name, int horsePower, int height, int tankCapacity, int price, String category) {
        this.name = name;
        this.horsePower = horsePower;
        this.height = height;
        this.tankCapacity= tankCapacity;
        this.price=price;
        this.category = category;
    }
    //гетери
    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getHeight() {
        return height;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    //сетери
    public void setName(String name) {
        this.name = name;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void bikeInfo(){ //Метод на вивід інформації
        System.out.println("Category: "+category);
        System.out.println("Name: "+ name);
        System.out.println("HorsePower "+ horsePower+" к.с.");
        System.out.println("height: "+ height+" мм");
        System.out.println("Tank capacity: "+ tankCapacity+" л");
        System.out.println("Price: "+ price+" €");
    }

}
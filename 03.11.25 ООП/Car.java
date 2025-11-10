package Homework;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isRunning;
    private double mileage;

    public Car(){
        this("None", "000", 0, "Black", 0.0, false, 0.0);
    }

    public Car(String brand, String model, int year){
        this(brand, model ,year, "Black", 0.0, false, 0.0);
    }

    public Car(String brand, String model, int year, String color,double price, boolean isRunning, double mileage){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
        this.mileage = mileage;
    }

    //m

    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Цвет: " + color);
        System.out.println("Цена: " + price);
        System.out.println("Заведена ли: " + isRunning);
        System.out.println("Пробег: " + mileage);
    }

    public void startEngine(){
        if (isRunning){
            System.out.println("Двигатель уже заведен.");
        }else{
            isRunning = true;
        }
    }

    public void stopEngine(){
        if (!isRunning){
            System.out.println("Двигатель уже заглушен.");
        }else{
            isRunning = false;
        }
    }

    public void drive(double distance) {
        if (isRunning) {
            mileage += distance;
            System.out.println("Вы проехали "+distance+ " км");
        } else {
            System.out.println("Двигатель не заведен! Машина не может ехать");
        }
    }

    public void repaint(String newColor) {
        color = newColor;
        System.out.println("Теперь машина имеет " +newColor+" цвет.");
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
        System.out.println("Теперь машина стоит " +newPrice);
    }
}

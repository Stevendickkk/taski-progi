package Homework;

public class MobilePhone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoveredOn;

    //c

    public MobilePhone(){
        this("None","000",0,0,false);
    }

    public MobilePhone(String brand, String model, int storageGB){
        this(brand, model, storageGB, 5000, false);

    }

    public MobilePhone(String brand,String model, int storageGB, int batteryLevel, boolean isPoveredOn){
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = batteryLevel;
        this.isPoveredOn = isPoveredOn;
    }

    //m

    public void displayInfo(){
        System.out.println("Бренд телефона: " + brand);
        System.out.println("Модель телефона: " + model);
        System.out.println("Объем памяти: " + storageGB);
        System.out.println("Аккумулятор: " + batteryLevel);
        System.out.println("Включен ли: " + isPoveredOn);
    }

    public void poverOn(){
        if (isPoveredOn){
            System.out.println("Телефон уже включен!");
        }else{
            isPoveredOn = true;
        }
    }

    public void poverOff(){
        if (!isPoveredOn){
            System.out.println("Телефон уже выключен!");
        }else{
            isPoveredOn = false;
        }
    }

    public void chargeBattery(int percent){
        if ((batteryLevel + percent ) <= 100){
            batteryLevel += percent;
        }else{
            batteryLevel = 100;
        }
    }

    public void useBattery(int percent){
        if ((batteryLevel - percent)>= 0){
            batteryLevel -= percent;
        }else{
            isPoveredOn = false;
            batteryLevel = 0;
        }
    }

}

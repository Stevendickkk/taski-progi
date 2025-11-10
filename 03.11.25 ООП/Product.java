package Homework;

public class Product {
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;

    //c

    public Product(){
        this("Без названия",0.0,"Без категории",false,0);
    }

    public Product(String name ,double price ,String category){
        this(name,price,category,false,0);
    }


    public Product(String name ,double price ,String category, boolean inStock ,int quantity){
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;
    }

    //m

    public void displayInfo(){
        System.out.println("Название: "  +name);
        System.out.println("Цена: " + price);
        System.out.println("Категория: " + category);
        System.out.println("В наличии: " + inStock);
        System.out.println("Кол-во на складе: " + quantity);
    }

    public void applyDiscount(double percent){
        price -= (percent*0.01)*price;
        System.out.println("Теперь цена товара = " + price + "( -" +percent+"%)");
    }

    public void restock(int amount){
        quantity += amount;
    }

    public void sell(int amount){
        if (quantity >= amount){
            quantity -= amount;
        }else {
            System.out.println("Недостаточно " +(amount - quantity )+" ед. товара" );
        }
    }




}

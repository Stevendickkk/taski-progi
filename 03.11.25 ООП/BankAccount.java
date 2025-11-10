package Homework;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String currency;
    private boolean isActive;

    //constructors

    public BankAccount(){
        this("0","John",0.0,"None",false);
    }

    public BankAccount(String accountNumber,String ownerName){
        this(accountNumber, ownerName,0.0,"None",false);
    }

    public BankAccount(String accountNumber,String ownerName,double balance,String currency,boolean isActive){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
        this.isActive = isActive;
    }

    //Methods

    public void displayInfo(){
        System.out.println("Номер счета: "  + accountNumber);
        System.out.println("Владелец счета: "  + ownerName);
        System.out.println("Баланс: "  + balance);
        System.out.println("Валюта: "  + currency);
        System.out.println("Активность: "  + isActive);
    }

    public void deposit(double dep){
        balance += dep;
    }

    public void withdraw(double draw){
        if (balance >= draw){
            balance -= draw;
        }else{
            System.out.println("Недостаточно средств!");
        }
    }

    public void activeAccount(){
        if (!isActive){
            System.out.println("Счет уже активирован!");
        }else{
            isActive = true;
        }
    }

    public void deactiveAccount(){
        if (isActive){
            isActive = false;
        }else{
            System.out.println("Счет уже заблокирован!");

        }
    }

}

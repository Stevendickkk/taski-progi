package Homework;

public class Mainbank {
    public static void main(String[] args){
        BankAccount bacc1 = new BankAccount();

        bacc1.deposit(10000.0000);
        bacc1.displayInfo();
        bacc1.withdraw(99999.0);
    }
}

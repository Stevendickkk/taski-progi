package Homework;

public class MainBook {
    public static void main(String[] args){

        Book untilted_book = new Book();
        Book alone_with_myself = new Book("Наедине с собой","Марк Аврелий",193,true,295);

        untilted_book.displayInfo();
        alone_with_myself.borrowBook();

    }
}

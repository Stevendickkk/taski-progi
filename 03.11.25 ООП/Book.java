package Homework;

public class Book{
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private int pageCount;

    //Constructors

    public Book() {
        this("Без названия", "Без автора", 0, false, 0);
    }

    public Book(String title, String author, int year) {
        this(title, author, year, false, 0);
    }

    public Book(String title, String author, int year, boolean isAvailable, int pageCount){
       this.title = title;
       this.author = author;
       this.year = year;
       this.isAvailable = isAvailable;
       this.pageCount = pageCount;
    }

    //Methods

    public void displayInfo(){
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
        System.out.println("Доступ к выдаче: " + isAvailable);
        System.out.println("Кол-во страниц: " + pageCount);
    }

    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
        }else{
            System.out.println("Книга уже выдана!");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
        }else{
            System.out.println("Книга уже в библиотеке  !");
        }
    }

    public void updateYear(int newYear){
        year = newYear;
    }




}

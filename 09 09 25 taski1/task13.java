import java.util.Scanner;

public class task13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n0 = -1000;
        int n1 = 0;
        while (n1 > n0){
            n0 = n1;
            n1 = scan.nextInt();
        }
        System.out.println("STOP!1!1!");
    }
}
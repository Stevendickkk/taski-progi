import java.util.Scanner;

public class task8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i = 2; i < 10 ;i++)  {
            System.out.println(k+" * "+i+" = "+i*k);
        }

    }
}
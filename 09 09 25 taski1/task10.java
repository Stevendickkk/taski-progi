    import java.util.Scanner;

public class task10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 1;
        System.out.print(n+" = ");
        while (n>0)
        {
            if (n % 10 != 0)
            {
                System.out.print(n % 10 * k + " + ");
            }
            n /= 10;
            k *= 10;
        
        }

    }

}


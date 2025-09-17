import java.util.Scanner;

public class task12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String b = "";
        while (i>0){
            String ch = String.valueOf(i%2);
            b += ch;
            i /=2;
        }
        //  ПЕРЕВЕРТЫШ
        String p = "";
        int d = b.length() - 1;
        while(d >= 0)
        {
            char si = b.charAt(d);
            p += si;
            d--;
        }
        System.out.print(p);
    }
}

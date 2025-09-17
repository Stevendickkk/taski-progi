import java.util.Scanner;

public class task3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float z = scan.nextFloat();
        float x = scan.nextFloat();
        float c = scan.nextFloat();
        if (z > x && z > c) {
            System.out.println(z + " - Число z , больше остальных");
        }
        else if(x > z && x > c)
        {
            System.out.println(x + " - Число x , больше остальных");
        }
        else {
            System.out.println(c + " - Число c , больше остальных");
        }

    }
}
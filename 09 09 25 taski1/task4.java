import java.util.Scanner;

public class task4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float z = scan.nextFloat();
        float x = scan.nextFloat();
        if (z == x)
        {
            System.out.println("Числа " + z +" и " +x+" равны");
        }
        else
        {
            System.out.println("Числа не равны");
        }


    }
}
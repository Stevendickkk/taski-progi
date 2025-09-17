import java.util.Scanner;

public class task6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        if ((x*x + y*y ) < r*r)
        {
            System.out.println("Точка с коорд-ми (" + x+ " ; " +y +") лежит в круге с радиусом "+r);
        }
        else if ((x*x + y*y )== r*r)
        {
            System.out.println("Точка лежит на окружности");
        } else {
            System.out.println("Не лежит");
        }
    }
}

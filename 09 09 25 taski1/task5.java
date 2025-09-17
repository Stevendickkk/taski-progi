import java.util.Scanner;

public class task5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        float p = (float)n/2;
        if (x >= -p && x <= p && y >= -p && y <= p)
        {
            System.out.println("Да, точка с коорд-ми( "+x+";"+y+ " ) лежит");
            System.out.println("в квадрате со стороной "+n);
        }
        else {
            System.out.println("Нет, точка не лежит в квадрате");
        }


    }
}
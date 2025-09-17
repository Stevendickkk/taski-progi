import java.util.Scanner;

public class task7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        float r = x*x+y*y;
        boolean flag = false;
        for (int i = 0;i<=10;i++ ) {
            if (r > i * i && r < (i + 1) * (i + 1)) {
                System.out.println("кружок №" + (i + 1));
                flag = true;
                break
            }
        }
        if (flag == false)
        {
            System.out.println("missed");
        }
    }
}


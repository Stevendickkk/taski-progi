
import java.util.Scanner;

public class taskkr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        float sum = 0;

        for (int k = 1 ; k <= n; k++){
            sum += ((float)(pow(x,(3*k-1)))/(fact(2*k)+k));
        }

        System.out.println(sum);

    }
    public static int pow(int x,int p){
        int pow = 1;
        for (int i = 0; i < p; i++){
            pow *= x;
        }
        return pow;
    }
    public static int fact(int x){
        int fact = 1;
        for (int i = 1 ;i <= x; i++){
            fact *= i;
        }
        return fact;
    }
}


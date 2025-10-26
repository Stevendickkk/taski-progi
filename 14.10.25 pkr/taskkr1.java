
import java.util.Scanner;

public class taskkr1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("["+ i + "]");
            arr[i] = sc.nextInt();
        }

        if (sumc(arr[0]) == sumc(arr[n-1])){
            System.out.println("сумма цифр последнего числа равна сумме цифр первого");
        }else{
            System.out.println("нет");}
    }
    public static int sumc(int n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}


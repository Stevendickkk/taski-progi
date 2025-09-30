import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            s += arr[i];
        }
        System.out.println("Cумма элементов = "+ s);


    }
}
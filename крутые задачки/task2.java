import java.util.Scanner;

public class taskn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chet = 0;
        int nechet = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (arr[i]%2==0){
                chet++;
            }else{
                nechet++;
            }

        }
        System.out.println("Cумма четных =   "+ chet);
        System.out.println("Cумма нечетных = "+ nechet);


    }

import java.util.Scanner;

public class taskn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arrc[] = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            arrc[i] = arr[i];
        }

        for (int i = 0; i < n-1; i++){
            for (int j = i; j < n; j++){
                if (arr[i] > arr[j]){
                    arrc[i] = arr[j];
                    arrc[j] = arr[i];
                }
            }
        }

        for (int i = 0; i < n; i++){
            System.out.print(arrc[i] +" ");
        }

    }
}
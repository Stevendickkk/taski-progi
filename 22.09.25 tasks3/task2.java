import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0 ; i < n1; i++){
            arr1[i] = scan.nextInt();
        }

        int n2 = scan.nextInt();
        if (n2 != n1){
            System.out.println("Не равны");
            flag = false;
        }
        else {
            int[] arr2 = new int[n2];
            for (int i = 0 ; i < n2; i++){
                arr2[i] = scan.nextInt();
                if (arr1[i] != arr2[i]){
                    System.out.println("Не равны");
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
        {
            System.out.println("РАВНЫЫЫЫЫФ");
        }
}}


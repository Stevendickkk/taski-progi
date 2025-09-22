import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        boolean flag = true;
        for (int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
            if (chet(arr[i]) && ( arr[i] > 0)){
                System.out.println("ДА");
                flag = false;
                break;
            }

        }
        if (flag){
            System.out.println("НЕЕЕЕТ");
        }


    }

    public static boolean chet(int n) {
        boolean flag = false;
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                flag = true;
            }
            n/=10;
        }
        return flag;
    }
}


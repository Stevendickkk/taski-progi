import java.util.Scanner;

public class task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int x = 3;
        int y = 3;
        int arr[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            int k = 0;
            for (int j = 0; j < x; j++) {
                arr[i][j] = sc.nextInt();
                if (sumnum(arr[i][j]) % 5 == 0) {
                    k++;
                }
            }
            if (k < 2) {
                System.out.println("МАЛАААААААААААА");
                flag = false;
                break;
            }

        }
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        if (flag){
            System.out.println("ВСЕ ПО КАЙФУ БРАТИШКА");
        }


    }

    public static int sumnum(int x){
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x/=10;
        }
        return sum;
    }

}

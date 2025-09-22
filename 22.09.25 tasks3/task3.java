import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        boolean flag = true;
        for (int i = 0; i < n ; i++){
            arr[i] = scan.nextInt();
            if ( arr[i] < 0){
                System.out.println("ОТРИЦАТЕЛЬНОЕ СУЩЕСТВУЕТ");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("ОТРИЦАТЕЛЬНЫХ НЕТУ");
        }


}
}


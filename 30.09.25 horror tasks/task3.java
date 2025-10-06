import java.util.Scanner;

public class task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int k = 0;

        //ввод массива
        int arr[][] =  new int[x][y];
        for (int i = 0; i < x ; i++){
            for (int j = 0; j < y ; j++) {
                arr[i][j] = sc.nextInt();
                }
            }

        //проверка массива
        for (int i = 0; i < x ; i++){
            boolean flag = false;
            for (int j = 0; j < y ; j++) {
                if (prime(arr[i][j]) && prime(sum(arr[i][j]))){
                    flag = true;
                }
            if (flag){
                k++;
            }
            }
        }


        if (k==x) System.out.println("ВСе збс");
        else System.out.println("Ниче не збс");
        
        //вывод массива
        for (int i = 0; i < x ; i++){
            for (int j = 0; j < y ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
    public static boolean prime(int x) {

        if (x <= 1) return false;
        if (x == 2) return true;
        if (x%2==0) return false;

        for (int i = 3; i*i < x; i++){
            if (x%i ==0){
                return false;
            }
        }

    return true;

    }


    public static int sum(int x){
        int sum = 0;
        while (x > 0){
            sum += x%10;
            x/=10;
        }
        return (sum);
    }
}
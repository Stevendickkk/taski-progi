import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int cnt = 0;
        //ВВОД МАТРИЦЫ
        int arr[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            boolean flag = false;
            for (int j = 0; j < y; j++) {
                if (chetko(arr[i][j])){
                    flag = true;
                }
            }
            if (flag){
                cnt++;
            }
        }

        // OTVET

        if (cnt == y){
            System.out.println("ВСЕ ЧЕТКО, БРАТКА, ВСЕГО "+cnt+" ЧИСЕЛ, КАК И СТОЛБЦОВ");
        } else {
            System.out.println("УЦИШКА, СТОЛБЦОВ "+y+" ,А ЧИСЕЛ ВСЕГО "+cnt);
        }
        
        //ВЫВОД МАТРИЦЫ
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //ПРОВЕРКА ЧИСЛА НА ЧЕТНЫЕ ЦИФРЫ
    public static boolean chetko(int x){
        boolean chetk = true;
        while (x > 0) {
            if ((x%10)%2!=0){
                chetk = false;
                break;
            }else {
                x/=10;
            }
        }
        return  chetk;
    }
}



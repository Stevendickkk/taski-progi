import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean flag1 = false;
        int arr[][] = new int[x][y];
        for (int i = 0; i < x ; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < x; i++) {
            boolean flag2 = true;
            for (int j = 0; j < y; j++) {
                if (arr[j][i] % 3 != 0) {
                    flag2 = false;
                    break;
                }
                if (flag2 == true) {
                    flag1 = true;
                    break;
                }
            }
        }

// OTVET

        if (flag1){
            System.out.println("ВСЕ ЧЕТКО, БРАТКА");
        } else {
            System.out.println("УЦИШКА, ПОПРАВЬ СТОЛБЕЦ , ДА");
        }

//ВЫВОД МАТРИЦЫ
        for (int i = 0; i < x ; i++) {
            for (int j = 0; j < y ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

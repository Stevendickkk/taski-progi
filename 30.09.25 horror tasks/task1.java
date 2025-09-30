import java.util.Scanner;

public class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону матрицы");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int flag = 0;
        int arr[][] =  new int[x][y];
        for (int i = 0; i < n ; i++){
            int cp = 0;
            for (int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
                if (palin(arr[i][j])) {
                    cp++;
                }
            }
            if (cp == 1)
                flag++;
        }
        //сверка
        if (flag == x){
            System.out.println("Все верно чувак");
        }else{
            System.out.println("нИЧЕ НЕ ВЕРНО ЧУВАК");
        }

        //вывод матрицы
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean palin(int x){
        int orig = x;
        int rewers = 0;
        while (x > 0){
            int num = x%10;
            rewers = rewers * 10 + num;
            x/=10;
        }
        return (orig==rewers);
    }
}
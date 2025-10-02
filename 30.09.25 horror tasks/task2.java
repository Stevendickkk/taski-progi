import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк матрицы");
        int x = sc.nextInt();
        System.out.println("Введите кол-во столбцов матрицы");
        int y = sc.nextInt();


        //ввод массива
        int arr[][] =  new int[x][y];
        for (int i = 0; i < x ; i++){
            for (int j = 0; j < y ; j++) {
                arr[i][j] = sc.nextInt();
                }
            }

        boolean flag = false;
        for (int i = 0; i < x ; i++){
            int cursum = sum(arr[0][i]);
            for (int j = 0; j < y ; j++) {
                if (cursum == sum(arr[j][i])){
                    if (j ==(x-1)){
                        flag = true;
                    }
                }else{ break;}
            }
        }

        if (flag){
            System.out.println("ВСЕ хоРОшО");
        }else {
            System.out.println("ВСЕ ПЛОХО");}

        //вывод матрицы
        for (int i = 0; i < x ; i++){
            for (int j = 0; j < y ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

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
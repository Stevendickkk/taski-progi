import java.util.Scanner;
public class task5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int s[][] = new int[x][y];
        sc.nextLine();

        for (int i = 0;i < x; i++){
            for (int j = 0;j < y; j++){
                System.out.println(i + " " + j);
                s[i][j] = sc.nextInt();
            };
        }

        for (int j = 0;j < y; j++){
            for (int i = 0;i < x; i++){
                System.out.print(s[i][j]);
            }
            System.out.println();
        }

    }
}
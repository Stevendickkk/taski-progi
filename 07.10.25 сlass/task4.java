import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = 5;
        int z = 0;
        String arr[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "String ";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int y = 0;
            for (int j = 0; j < n; j++) {
                if (glas(arr[j][i])) {
                    y++;
                }
            }
            if (y <= 2) {
                z++;
            }
        }
        if (z == n) {
            System.out.println("vse horosho");
        } else {
            System.out.println("ne ochen");
        }


    }

    public static boolean glas(String str) {
        int k = 0;
        String alf = "EYUIAO";
        for (int j = 0; j < alf.length(); j++) {
            if (str.charAt(0) == alf.charAt(j)) {
                k++;
            }
        }
        if (k == 1) {
            return true;
        } else {
            return false;
        }
    }
}
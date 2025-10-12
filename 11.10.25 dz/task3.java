import java.util.Scanner;
public class task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи кол-во столбцов");
        int x = sc.nextInt();
        System.out.println("Введи кол-во строчек");
        int y = sc.nextInt();
        String s[][] = new String[x][y];
        sc.nextLine();

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.println(i +" "+j);
                s[i][j] = sc.nextLine();
            }
        }

        String glasni = "aieouAIEOU";
        int scnt = 0;
        for (int i  = 0; i < x; i++){
            int k  = 0;
            boolean flag = false;
            for (int j = 0; j < y; j++){
                for(int m  = 0 ;  m < glasni.length(); m++){
                    if (s[j][i].charAt(s[j][i].length() - 1) == glasni.charAt(m)){
                        flag = true;
                    }
                }
                if (flag){
                    k++;
                    flag = false;
                }
            }
            if (k >=1){ scnt++;}
        }
        if (scnt>=x){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                System.out.print(s[i][j]+ " ") ;
            }
            System.out.println();
        }



    }
}
import java.util.Scanner;

public class taskn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введи слово");
        String s = sc.nextLine();
        String alp = "aeiouAEIOU";
        int c = 0;

        for (int i = 0; i < s.length() ; i++){
            for (int j = 0; j < alp.length() ; j++){
                if (s.charAt(i) == alp.charAt(j)){
                    c++;
                }

            }

        }
        if (c == 3) {
            System.out.println("все верно");
        }else{
            System.out.println("ниче не верно");

        }
    }
}

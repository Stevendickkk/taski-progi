import java.util.Scanner;

public class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String finals = "";
        boolean flag = true;

        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if (c >= 'А' && c<= 'Я'){
                finals += (char)(c+32);
            }
            else if(c == ' '){
                continue;
            }
            else {
                finals += c;
            }
        }

        for (int i = 0; i < (finals.length())/2 ; i++){
            if (finals.charAt(i) != finals.charAt(finals.length() - 1 - i)){
                flag = false;
            }
        }
        System.out.println(flag);

    }
}
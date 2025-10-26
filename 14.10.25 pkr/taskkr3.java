import java.util.Scanner;

public class taskkr3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdefghg";
        boolean flag = true;
        String ans = delSimb(s);
        char last = ans.charAt(0);

        for (int i = 1; i < ans.length(); i++) {
            if (last <= ans.charAt(i)){
                last  = ans.charAt(i);
            }else {
                System.out.println("СТОПЭЭЭ");
                flag = false;
                break;}
        }

        if (flag){
            System.out.println("Все топ");
        }

    }
    public static String delSimb(String s){
        String delabc = "aoeiuAOEIU., 0123456789";
        String ans = "";
        for (int i = 0 ; i < s.length(); i++){
            boolean flag = true;
            for (int j = 0 ; j < delabc.length(); j++) {
                if (s.charAt(i) == delabc.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                ans += s.charAt(i);
            }

        }
        return ans;
    }
}


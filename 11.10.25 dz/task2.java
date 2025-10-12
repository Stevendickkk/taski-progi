import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pr = sc.nextLine();
        int spaces = 1;
        int j = 0;

        //кол-во слов в предложении
        for (int i = 0 ; i < pr.length(); i++){
            if (pr.charAt(i) == ' '){
                spaces++;
            }
        }
        String s[] = new String[spaces];
        //Делим слова на предложения
        for (int i = 0 ; i <spaces; i++) {
            String word = "";
            while ( j<pr.length() && pr.charAt(j) != ' ' ) {
                word += pr.charAt(j);
                j++;
            }
            s[i] = word;
            j++;
        }

        int maxgl = 0;
        int maxi = 0;
        for (int i = 0 ; i <spaces; i++) {
            if (maxgl < cgl(s[i])){
                maxi = i;
                maxgl = cgl(s[i]);
            }
        }

        System.out.println(s[maxi]);
    }


    public static int cgl(String s){
        String gl = "aieouAIEOU";
        int c = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j <gl.length(); j++){
                if (s.charAt(i) == gl.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }

}
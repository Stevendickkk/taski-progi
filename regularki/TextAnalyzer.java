import java.util.Scanner;

public class TextAnalyzer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Компания \"Рога и копыта\" основана 15.03.2005. Контакты: director@roga.ru, support@roga-kopita.com. Бюджет проекта: 1500000 рублей. Штаб-квартира в Москве. ";

        int ek = 1;
        String word = "";
        System.out.println("Email-адреса:");
        for (int i = 0; i < s.length()-1 ; i++) {
            if (((s.charAt(i) != ' ') && (s.charAt(i) != ',')) && !(s.charAt(i)== '.' && s.charAt(i+1) == ' ') ) {
                word += s.charAt(i);
            } else if (findEmails(word)) {
                    System.out.println(ek +". " + word);
                    ek++;
                    word = "";
            } else {
                word = "";
            }
            }


        int dk = 1;
        String date = "";
        System.out.println("Даты:");
        for (int i = 0; i < s.length()-1 ; i++) {
            if (((s.charAt(i) != ' ') && (s.charAt(i) != ',')) && !(s.charAt(i)== '.' && s.charAt(i+1) == ' ') ) {
                date += s.charAt(i);
            } else if (findDates(date)) {
                    System.out.println(dk +". " + date);
                    dk++;
                    date = "";
            } else {
                date = "";
                }
            }

        int nk = 1;
        String name = "";
        System.out.println("Слова с заглавной буквы:");
        for (int i = 0; i < s.length()-1 ; i++) {
            if (((s.charAt(i) != ' ') && (s.charAt(i) != ',') && (s.charAt(i) != '"') && (s.charAt(i) != ':'))
                    && !(s.charAt(i)== '.' && s.charAt(i+1) == ' ') && (i>2 && s.charAt(i-2)!='.')) {
                name += s.charAt(i);
            } else if (findCapitalizedWords(name)) {
                System.out.println(nk +". " + name);
                nk++;
                name = "";
            } else {
                name = "";
            }
        }
        System.out.print("Общее количество цифр: ");
        System.out.println(countDigits(s));


    }





    public static boolean findEmails(String text){
        return text.matches("[a-zA-Z0-9_%+.]+@[a-z0-9-.]{2,}");
    }

    public static boolean findDates(String date){
        return date.matches("(([0-2][0-9])|3[0-1])\\.(0[1-9]|1[0-2])\\.((19[0-9][0-9])|20[0-9][0-9])");
    }

    public static boolean findCapitalizedWords(String text){
        return text.matches("([А-Я][а-я-]*)|([A-Z][a-z-]*)");
    }

    public static int countDigits(String text){
        String digits = "0123456789";
        int ans = 0;
        for (int i = 0; i < text.length(); i++){
            for (int j = 0; j <10; j++) {
                if (text.charAt(i)==digits.charAt(j)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }


}
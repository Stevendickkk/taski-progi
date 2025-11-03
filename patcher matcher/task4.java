import java.util.regex.*;

public class task4{
    public static void main(String[] args) {
        String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";

        Pattern pattern = Pattern.compile("[А-Яа-я0-9,]+");
        Matcher matcher = pattern.matcher(csv);
        while (matcher.find()) {
            System.out.println( matcher.group());
        }

    }
}
import java.util.regex.*;

public class task5{
    public static void main(String[] args) {
        String post = "Сегодня был в #парке и #кино #отдых #выходные";

        Pattern pattern = Pattern.compile("#[а-яА-Я0-9]*");
        Matcher matcher = pattern.matcher(post);
        while (matcher.find()) {
            System.out.println( matcher.group());
        }

    }
}
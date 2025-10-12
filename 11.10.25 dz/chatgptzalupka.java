public class chatgptzalupka {
    public static void main(String[] args) {
        String text = "HeLLo WoRLd";
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Если заглавная буква (A–Z)
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32); // превращаем в строчную
            }
            result += c;
        }

        System.out.println(result); // hello world
    }
}
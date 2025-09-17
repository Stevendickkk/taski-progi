import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.nextLine();
        char command = scan.nextLine().charAt(0);
        switch (command)   
        {
        case '+' -> System.out.println(sum(num1,num2));
        case '-' -> System.out.println(num1-num2);
        case '/' -> System.out.println(num1/num2);
        case '*' -> System.out.println(num1*num2);
        } 
    }
    public static int sum(int n1, int n2){
      return n1+n2;
      } 
}


import java.util.Scanner;
public class task6v1{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    float x = scan.nextFloat();
    float s = 0;
    int f = 1;
    float px = 1;
    for (int i = 1; i <= n; i++){
      f *= i;
      s += f*(x*px);
      px *= x;
    }
    System.out.println("S = " + s);

  }
}
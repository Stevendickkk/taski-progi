import java.util.Scanner;

public class task5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int f = 1;
        int s = 0;
        for (int i = 1; i <= n; i++)
        {
            f *= i;
            s += f;
        }
        System.out.println(s);

	}
}
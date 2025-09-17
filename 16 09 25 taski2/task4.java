import java.util.Scanner;

public class task4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = 0;
		int p = 1;
		for (int i = 1; i <= n; i++)
		{
			for (int j = i; j <= i; j++)
			{
				s += 2*p;
				p = p*2;
			}
		}
		System.out.println("S"+n+ " = "+s);
	}
}
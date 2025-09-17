import java.util.Scanner;

public class task3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = 1;
		int s = 0;
		for (int i = 1; i<=n ;i++)
		{
			s += n*p;
			p *= n;
		}
		 System.out.println("S"+n+" = " + s);
	}
}
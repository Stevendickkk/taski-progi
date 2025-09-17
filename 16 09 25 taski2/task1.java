import java.util.Scanner;

public class task1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++){
				System.out.print("1");
			}
			System.out.println();
		}

	}
}
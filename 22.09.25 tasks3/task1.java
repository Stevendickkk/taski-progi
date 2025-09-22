import java.util.Scanner;

public class task1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int max = arr[0];
		for (int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
			if (arr[i] > max){
				max = arr[i];
			}	
		}
	System.out.println("MAX = "+max);

	}
}
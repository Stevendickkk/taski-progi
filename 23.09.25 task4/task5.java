import java.util.Scanner;

public class task5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[][] = new int[n][n];

		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				if ((i+j)%2==0){
					arr[i][j] = 1;
				}else{
					arr[i][j] = 0;
				}
			}
		
		}

		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}

	}
}
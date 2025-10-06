import java.util.Scanner;

public class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if (i == (n/2 ) || j == (n/2)){
					arr[i][j] = 1;
				}else{
					arr[i][j] = 0;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	} 
}


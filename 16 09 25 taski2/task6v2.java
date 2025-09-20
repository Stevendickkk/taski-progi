import java.util.Scanner;

public class task6v2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		float x = scan.nextFloat();
		float sum = 0;
		for (int i = 1; i <= k; i++){
			sum+= fact(i)*(pow(x,i)); 
		}
		System.out.println(sum);
}
	

	public static int fact(int x){
		int ans = 1;
		for (int i = 1;i <= x; i++){
			ans *=i;
		}
		return ans;
	}	

	public static float pow(float x, int p){
		float ans = 1;
		for (int i = 1; i <= p;i++){
			ans *= x;  
		}
		return ans;
	}

}
	

	

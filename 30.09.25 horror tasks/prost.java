import java.util.Scanner;

public class prost{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (prime(n)) System.out.println("ПРОСТОЕ");
		else System.out.println("СОСТАВНОЕ");


	}
	public static boolean prime(int x) {

        if (x <= 1) return false;
        if (x == 2) return true;
        if (x%2==0) return false;

        for (int i = 3; i <=  x; i+2){
            if (x%i ==0){
                return false;
            }
        }
        
    return true;

    }
}

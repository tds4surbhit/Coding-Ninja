package recursion1;

import java.util.Scanner;

public class Power {
	
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		
		int shortAnswer = power(x,n-1);
		int finalAnswer = shortAnswer * x;
		return finalAnswer ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		int finalPower = power(n,x);
		System.out.println(finalPower);
	}

}

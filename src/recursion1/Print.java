package recursion1;

import java.util.Scanner;

public class Print {
	
	public static void printNumber(n) {
		if(n==0) {
			return;
		}
		
		printNumber(n-1);
		System.out.println(n + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		Print.printNumber();
	}

}

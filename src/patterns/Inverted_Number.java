package patterns;

import java.util.Scanner;

public class Inverted_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		for(int i = 1; i <= n ; i++) {
			
			for(int k = 1 ; k <= n-i+1 ; k++) {
				System.out.print(n-i+1);
			}
			for(int j = 1; j <= i-1 ; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}

package patterns;

import java.util.Scanner;

public class MirrorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		for(int i = 1; i <= n ; i++) {
			int temp = 1;
			for(int j = 1; j <= n-i ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ; k++) {
				System.out.print(temp++);
			}
			System.out.println();
		}
	}

}

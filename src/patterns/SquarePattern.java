package patterns;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		// TODO Auto-generated method stub
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				System.out.print(N);
			}
			System.out.println();
		}
	}

}

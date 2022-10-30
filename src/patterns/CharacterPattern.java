package patterns;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			char startingChar = (char)('A'+i-1);
			for(int j = 1 ; j <= i; j++) {
				System.out.print((char)(startingChar++));
			}
			System.out.println();
		}
	}	

}

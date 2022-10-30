package Arrays;

import java.util.Scanner;

public class FindUnique {
	
	public static int findUnique(int[] arr) {
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			int count = 0;
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 0) {
				return arr[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(findUnique(arr));
		
	}

}

package Arrays;

import java.util.Scanner;

public class ArraySum {
	
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(sum(arr));
		
	}

}

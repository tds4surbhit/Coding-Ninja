package Arrays;

import java.util.Scanner;

public class SwapAlternate {
	
	public static void swapAlternate(int[] arr) {
		for(int i = 0 ; i < arr.length ; i=i+2) {
			int temp = arr[i+1];
			arr[i+1] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		swapAlternate(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

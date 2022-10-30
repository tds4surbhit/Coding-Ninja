package patterns;

import java.util.Scanner;

public class Test_pattern {
	
	public static int pairSum(int[] arr, int x) {
		int count = 0;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			int sum = 0;
			for(int j = i+1 ; j < arr.length ; j++) {
				sum = arr[i] + arr[j];
				if(sum == x) {
					count++;
				}
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println(pairSum(arr,x));
		
		
	}

}

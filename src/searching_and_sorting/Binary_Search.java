package searching_and_sorting;

import java.util.Scanner;

public class Binary_Search {
	
	public static int binarySearch(int[] arr,int x) {
		int start = 0;
		int end = arr.length-1;
	
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] == x) {
				return mid;
			}
			else if(arr[mid] > x) {
				end = mid-1;
			}
			else {
				start = mid +1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(binarySearch(arr,x));
	}

}

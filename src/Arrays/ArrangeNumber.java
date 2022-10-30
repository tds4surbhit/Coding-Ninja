package Arrays;

import java.util.Scanner;

public class ArrangeNumber {
	
	public static void Arrange(int[] arr,int n) {
		int start = 0 ;
		int end = arr.length - 1;
		int counter = 1;
		while(start <= end) {
			if(counter % 2 == 1) {
				arr[start] = counter;
				start++;
				counter++;
			}else {
				arr[end] = counter;
				end--;
				counter--;
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		sc.close();
		
		Arrange(arr,n);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

package Arrays;

public class TripletSum {
	
	public static int tripletSum(int[] arr2 , int x) {
		int count = 0 ;
	for(int i = 0 ; i < arr2.length-2 ; i++) {
		for(int j = i+1 ; j < arr2.length-1 ; j++) {
			for(int k = j+1 ; k < arr2.length ; k++) {
				if(arr2[i] + arr2[j] + arr2[k] == x) {
					count++;
				}
			}
		}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12;
		int[] arr2 = {1,2,3,4,5,6,7};
		System.out.println(tripletSum(arr2,x));
	}

}

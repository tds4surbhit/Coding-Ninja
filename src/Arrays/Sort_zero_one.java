package Arrays;

public class Sort_zero_one {
	
	public static void sortZeroAndOne(int[] arr) {
		int zero_count = 0;
		int ones_count = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == 0) {
				zero_count++;
			}
			else {
				ones_count++;
			}
		}
		
		for(int i = 0 ; i < zero_count; i++) {
			arr[i] = 0;
		}
		for(int i = zero_count ; i < arr.length ; i++) {
			arr[i] = 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,1,0,1,0,1};
		sortZeroAndOne(arr);
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]);
		}
		
	}

}

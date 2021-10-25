package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> str1 = new ArrayList<>();
		System.out.println(list1.size());
		list1.add(15);
		list1.add(20);
		list1.add(25);
		list1.add(2, 50); // Index 2 pe 50 baki sab ek ek shift ho jaege
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i) + " "); //get function ka use karna hoga
		}
		
		list1.remove(1);
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i) + " "); //get function ka use karna hoga
		}
		
		//agar kisi perticular key pe jake element ko add karna hai taki pahle valla element delete ho jae 
		list1.set(3, 23);
		
		//For each loop sikh lo jani -quick travesal hai ye 
		for(int elem : list1) {
			System.out.println(elem + " ");
		}
		
		//list mei traversal karne ke liye he use kar skate hain for each loop ye mahi ki values assign kardi
//		jaise 
		for(int elem : list1) {
			elem = 100; //yesa ny ho sakta chutiye 
		}
	}

}

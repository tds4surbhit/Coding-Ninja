package linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeLinkedList {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null ;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head = newNode ;
			}
			else {
				Node<Integer> temp = head ;
				while( temp.next != null) {
					temp = temp.next;
					
				}
				temp.next = newNode;
			}
			data = sc.nextInt();
		}
		return head ;
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		Node<Integer> temp = head;
		ArrayList<Integer> arr = new ArrayList<>();
		while(head != null) {
			arr.add(head.data);
			head = head.next;
		}
		int start = 0 ;
		int end = arr.size() -1 ;
		while(start < end) {
			if(arr.get(start) != arr.get(end)) {
				return false ;
			}
			else {
				start++;
				end--;
			}
		}
		return true ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.println(isPalindrome(head));
		
	}

}

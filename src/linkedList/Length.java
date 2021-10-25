package linkedList;

import java.util.Scanner;

public class Length {
	
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
	
	public static int count(Node<Integer> head) {
		int count = 0 ;
		while(head != null) {
			count = count + 1 ;
			head = head.next;
		}
		return count ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		
		System.out.println(count(head));
	}

}

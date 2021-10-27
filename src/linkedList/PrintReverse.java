package linkedList;

import java.util.Scanner;

public class PrintReverse {
	
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
	
	public static Node<Integer> reverseLinkedlist(Node<Integer> head){
		Node<Integer> temp = head;
		
		while(temp != null) {
			Node<Integer> store = null;
			store = temp.next.next;
			temp.next.next = temp;
			
			temp.next= store.next;
		}
		return head ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node<Integer> head = takeInput();
		
	}

}

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
	
	public static void reverseLinkedlist(Node<Integer> head){
		if(head == null) {
			return ;
		}
		reverseLinkedlist(head.next);
		System.out.print(head.data + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node<Integer> head = takeInput();
		reverseLinkedlist(head);
	}

}

package linkedList_2;

import java.util.Scanner;

public class ReverseLinkedListM_2 {
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		while (data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if (head == null) {
				head = newNode;
			} else {
				Node<Integer> temp = head;
				while (temp.next != null) {
					temp = temp.next;

				}
				temp.next = newNode;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head == null || head.next == null) {
			return head ;
		}
		// temp tumhara reverseLinkedList ka pahla element hai 
		Node<Integer> finalHead = reverseLL(head.next);
		Node<Integer> temp = finalHead ;
		while(temp != null) {
			temp = temp.next;
		}
		temp.next = head ;
		head.next = null ;
		return finalHead ;
		
	}

	public static void main(String[] args) {
		// TODOAuto-generated method stub
		Node<Integer> head = takeInput();
		while(head != null) {
			System.out.print(head.data);
			head = head.next;
		}
	} 

}

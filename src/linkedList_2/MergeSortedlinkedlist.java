package linkedList_2;

import java.util.Scanner;

public class MergeSortedlinkedlist {
	
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
	
	public static Node<Integer> mergeSortedLinkedList(Node<Integer> head1 , Node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		Node<Integer> temp1 = head1;
		Node<Integer> temp2 = head2;
		Node<Integer> head3 = null;
		Node<Integer> tail3 = null;
		
		if(temp1.data <= temp2.data) {
			head3 = temp1 ;
			tail3 = temp1 ;
			temp1 = temp1.next;
		}else {
			head3= temp2;
			tail3 = temp2;
			temp2 = temp2.next;
		}
		
		while(temp1 != null && temp2 != null) {
			if(temp1.data <= temp2.data) {
				tail3.next = temp1;
				tail3 = temp1;
				temp1=temp1.next;
			}
			else {
				tail3.next= temp2;
				tail3 = temp2;
				temp2= temp2.next;
			}
		}
		
		if(temp1 != null) {
			tail3 = temp1 ;
		}
		else {
			tail3 = temp2 ;
		}
		
		return head3 ;
		
		
	}
	
	public static void print(Node<Integer> head) {
		// TODO Auto-generated method stub
		while(head != null) {
			System.out.println(head.data);
			head= head.next;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head = mergeSortedLinkedList(head1 , head2);
		print(head);
 		
	}

	
}

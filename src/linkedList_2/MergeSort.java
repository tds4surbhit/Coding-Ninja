package linkedList_2;

import java.util.Scanner;

public class MergeSort {

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

	public static Node<Integer> midPoint(Node<Integer> head) {
		if(head != null && head.next != null) {
			return head ;
		}
		Node<Integer> slow = head ;
		Node<Integer> fast = head ;
		while(head.next != null && head.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow ;
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

	public static Node<Integer> mergeSort(Node<Integer> head) {
		if(head == null && head.next == null) {
			return head ;
		}
		Node<Integer> temp = head ;
		Node<Integer> midpoint = midPoint(temp);
		while(temp != midpoint) {
			temp = temp.next ;
		}
		Node<Integer> temp2 ;
		temp2 = temp.next ;
		temp.next = null ;
		Node<Integer> head1 = mergeSort(head);
		Node<Integer> head2 = mergeSort(temp2);
		Node<Integer> finalHead = mergeSortedLinkedList(head1 ,  head2);
		return finalHead ;
 		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();

	}

}

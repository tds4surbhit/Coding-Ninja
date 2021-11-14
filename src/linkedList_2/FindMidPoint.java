package linkedList_2;

import java.util.Scanner;

public class FindMidPoint {
	
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
	
	public static Node<Integer> findMid(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> slow = head ;
		Node<Integer> fast = head ;
		while(fast.next != null && fast.next.next != null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Node<Integer> head1 = findMid(head);
		System.out.println(head1.data);
	}

}

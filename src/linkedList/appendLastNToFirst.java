package linkedList;

import java.util.Scanner;

public class appendLastNToFirst {
	
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
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head , int n) {
		int c = 0 ;
		Node<Integer> temp = head;
		Node<Integer> temp2 = head ;
		while(temp != null) {
			temp = temp.next;
			c= c+1;
		}
		
		for(int i = 0 ; i < c-n ; i++) {
			temp2 = temp2.next;
		}
		temp.next= head;
		head = temp2.next;
		return head ;
		
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node<Integer> head = takeInput();
//		Node<Integer> head2 = appendLastNToFirst(head);
//		print(head2);
		
		
	}

}

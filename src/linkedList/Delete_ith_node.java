package linkedList;

import java.util.Scanner;

public class Delete_ith_node {
	
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
	
	public static Node<Integer> deleteNode(Node<Integer> head , int pos){
		if(pos == 0) {
			head = head.next;
			return head ;
		}
		int i = 0 ; 
		Node<Integer> temp = head;
		while(i < pos-1 ) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		return head ;
		
	}
	
	public static void print(Node<Integer> head) {
		while(head.next != null) {
			System.out.println(head.next);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node<Integer>head = takeInput();
		head = deleteNode(head, n);
		print(head);
	}

}

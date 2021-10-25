package linkedList;

import java.util.Scanner;

public class Print_I_th_node {
	
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
	
	
//	public static void printIthNodevalue(Node<Integer> head , int i) {
//		while(head != null) {
//			int c = 0;
//			if(head.data == i) {
//				System.out.println(c+1);
//			}
//			else {
//				c++;
//				head = head.next;
//			}
//		}
//	}

	public static void printIthNode(Node<Integer> head , int i) {
		
		Node<Integer> n = head ;
		while(i != 0) {
			n=n.next;
			i--;
		}
		System.out.println(n.data);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		Node<Integer> head = takeInput();
		printIthNode(head , i);
	}

}

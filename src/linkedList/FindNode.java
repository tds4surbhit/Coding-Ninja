package linkedList;

import java.util.Scanner;

public class FindNode {
	
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
	
	public static int findNode(Node<Integer> head , int n) {
		Node<Integer> temp = head;
		int count = 0 ; 
		while(temp != null) {
			if(temp.data == n) {
				return count ;
			}
			else {
				temp = temp.next;
				count++;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node<Integer> head = takeInput();
		int ans = findNode(head , n);
		System.out.println(ans);
	}

}

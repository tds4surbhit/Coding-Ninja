package linkedList_2;

import java.util.Scanner;

public class ReverseLinkedListRecursivelly {

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
	private static Node<Integer> ans;
	public static Node<Integer> reverseLinkedListRecursively(Node<Integer> head) {
		if (head.next == null) {
			ans=head;
			return head;
		}
		Node<Integer> temp = reverseLinkedListRecursively(head.next);
		
		temp.next = head;
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Node<Integer> temp = head;
		Node<Integer> ans1 = reverseLinkedListRecursively(head);
		temp.next = null;
		while (ans != null) {
			System.out.println(ans.data);
			ans = ans.next;
		}
	}

}

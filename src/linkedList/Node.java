package linkedList;

public class Node<T> {
	public T data ;
	public Node<T> next ;
	
	Node(T data){
		this.data = data ;
		next = null ;
	}
}

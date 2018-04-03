/*Custom package Stack*/
package stack;
import java.util.EmptyStackException;
public class Stack<T> {
	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data){
			this.data = data;
		}
	}

	private Node<T> top = null; // Initialized to null
	private T min;
	
	public void push(T data){
		Node<T> n = new Node<T>(data);
		n.next = top;
		top = n;
	}
	
	public T pop(){
		if(top==null)throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}

	public T peek(){
		if(top==null)throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty(){
		return top == null;
	}
	
	public void print(){
		if(top==null)throw new EmptyStackException();
		for(Node<T> n = top;n!=null;n=n.next)
			System.out.print(" \u21E8 "+ n.data );
		System.out.print("\n");
	}
}

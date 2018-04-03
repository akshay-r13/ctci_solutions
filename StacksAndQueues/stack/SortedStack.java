/*Custom package Stack*/
package stack;
import java.util.EmptyStackException;

public class SortedStack {
	private static class Node {
		private int data;
		private Node next;

		public Node(int data){
			this.data = data;
		}
	}

	private Node top = null; // Initialized to null
	private int min;
	
	public void push(int data){
		Node n = new Node(data);
		if(top==null)top=n;
		else{
			Node ptr=top;
			while(ptr.next!=null && ptr.next.data < data){
				ptr = ptr.next;
			}
			n.next = ptr.next;
			ptr.next = n;
		}
	}
	
	public int pop(){
		if(top==null)throw new EmptyStackException();
		int item = top.data;
		top = top.next;
		return item;
	}

	public int peek(){
		if(top==null)throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty(){
		return top == null;
	}
	
	public void print(){
		if(top==null)throw new EmptyStackException();
		for(Node n = top;n!=null;n=n.next)
			System.out.print(" \u21E8 "+ n.data );
		System.out.print("\n");
	}
}


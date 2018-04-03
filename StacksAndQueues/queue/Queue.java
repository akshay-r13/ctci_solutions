/* Custom package Queue */
package queue;
import java.util.NoSuchElementException;

public class Queue<T> {
	public static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;

	public void add(T item){
		Node<T> n = new Node(item);
		if(last!=null)
			last.next=n;
		last = n;
		if(first==null)
			first=last;
	}
	public T remove(){
		if(first==null)throw new NoSuchElementException();
		T item = first.data;
		first = first.next;
		return item;
	}
	public T peek(){
		if(first==null)throw new NoSuchElementException();
		return first.data;
	}
	public boolean isEmpty(){
		return first == null;
	}
	public void print(){
		if(first==null)throw new NoSuchElementException();
		for(Node<T> n=first;n!=null;n=n.next)
			System.out.print(n.data + " \u21D0 ");
		System.out.print("\n");
	}

}

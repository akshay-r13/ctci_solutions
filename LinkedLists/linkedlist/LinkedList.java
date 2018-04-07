package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T> {
	private static class Node<T> {
		private T data;
		private Node next;

		public Node(T data){
			this.data = data;
			this.next = null;
		}
	}

	Node<T> head;
	Node<T> tail;
	int size;

	public void insert(T input){
		Node<T> n = new Node<T>(input);
		if(head==null){
			head = n;
			tail = n;
		}
		else{
			tail.next = n;
			tail = tail.next;
		}
		size++;
	}
	
	public void insertAt(T input,int index){	
		if(head==null || index>size){
			throw new NoSuchElementException();
		}
		else if(index == size){
			insert(input);
		}
		else if(index==0){
			Node n = new Node(input);
			n.next = head;
			head = n;
		}
		else{
			Node n = new Node(input);
			Node ptr = head;
			int i=0;
			while(i++<index-1){
				ptr = ptr.next;
			}
			n.next = ptr.next;
			ptr.next = n;
		}
		size++;
	}	

	public int size(){
		return this.size;
	}

	public T remove(){
		T output = null;
		if(head==null){
			throw new NoSuchElementException();
		}else if(head==tail){
			output = head.data;
			head = null;
			tail = null;
		}else{
			output  = tail.data;
			for(Node n = head;n!=null;n=n.next){
				if(n.next.next==null){
					tail = n;
					tail.next = null;
					break;
				}
			}
		}
		size--;
		return output;
	}
	

	public T removeAt(int index){
		T output = null;
		if(head==null || index >= size){
	                 throw new NoSuchElementException();
		}
		else if(head == tail || index == size-1){
			return this.remove();
		}
		else if(index==0){
			output = head.data;
			head = head.next;
		}
		else {
			Node ptr = head;
			int i = 0;
			while(i++<index-1){
				ptr = ptr.next;
			}
			output = (T)ptr.next.data;
			ptr.next = ptr.next.next;
		}
		size--;
		return output;
	}

	public boolean equals(LinkedList<T> l2){
		if(this.size != l2.size())return false;
		for(Node n1 = this.head,n2 = l2.getNode();n1!=null && n2 != null;n1 = n1.next,n2 = n2.next){
			if(n1.data != n2.data)
				return false;
		}
		return true;
	}
	
	public Node<T> getNode(){
		return this.head;
	}

	public void print(){
		for(Node n = head ; n!=null ; n = n.next){
 			System.out.print( " --> " +  n.data);
		}
		System.out.print("\n");
	}

}




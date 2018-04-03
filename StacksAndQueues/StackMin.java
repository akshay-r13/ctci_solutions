import java.util.*;

public class StackMin {
	public static class Stack {
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
			if(top==null)min=data;
			else min=Math.min(min,data);
			Node n = new Node(data);
			n.next = top;
			top = n;
		}
	
		public int pop(){
			if(top==null)throw new EmptyStackException();
			int item = top.data;
			top = top.next;
			this.min = (top==null)?0:top.data;
			for(Node n=top;n!=null;n=n.next)
				min = Math.min(n.data,min);
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

		public int min(){
			return min;
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Stack s = new Stack();
menu:
		while(true){
			System.out.println("Enter your choice:");
			System.out.println("1. Print stack");
			System.out.println("2. Push to stack");
			System.out.println("3. Pop from stack");
			System.out.println("4. Peek at stack");
			System.out.println("5. Get Minimum of stack");
			System.out.println("6. Exit");
			int ch = in.nextInt();
			switch(ch){
				case 1:
					try{
						s.print();
					}catch(EmptyStackException e){
						System.out.println("Stack is empty");
					}
					break;
				case 2:
					System.out.print("Enter a number : ");
					s.push(in.nextInt());
					break;
				case 3:
					try{
						System.out.println("Popped from stack -> " + s.pop());
					}catch(EmptyStackException e){
						System.out.println("Stack is empty");
					}
					break;
				case 4:
					try{
						System.out.println("Last element of stack -> " + s.peek());
					}catch(EmptyStackException e){
						System.out.println("Stack is empty");
					}
					break;
				case 5:
					System.out.println("Minimum of stack : " + s.min());
					break;
				case 6:
					break menu;
				default:
					System.out.println("Invalid input");
			}
		}
		
	}
}



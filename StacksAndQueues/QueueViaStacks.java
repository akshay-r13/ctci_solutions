import stack.Stack;
import java.util.*;

class Queue<T> {
	Stack<T> s1;
	Stack<T> s2;
	
	public Queue(){
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	public void add(T data){
		while(!s1.isEmpty())
			s2.push(s1.pop());
		s2.push(data);
		while(!s2.isEmpty())
			s1.push(s2.pop());
	}

	public T remove(){
		return s1.pop();
	}

	public T peek(){
		return s1.peek();
	}
	
	public boolean isEmpty(){
		return s1.isEmpty();
	}

	public void print(){
		s1.print();
	}

}
public class QueueViaStacks {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Queue<Integer> q = new Queue<Integer>();
menu:
		while(true){
			System.out.println("1. Add to Queue");
			System.out.println("2. Remove from Queue");
			System.out.println("3. Print Queue");
			System.out.println("4. Peek Queue");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			switch(in.nextInt()){
				case 1:
					System.out.print("Enter data : ");
					q.add(in.nextInt());
					break;
				case 2:
					try{
						System.out.println("Removed from Queue : " +q.remove());
					}catch(EmptyStackException e){
						System.out.println("Can't remove , Empty Queue");
					}
					break;
				case 3:
					q.print();
					break;
				case 4:
					try{
						System.out.println("First element in Queue : " + q.peek());
					}catch(EmptyStackException e){
						System.out.println("Can't peek , Empty Queue");
					}
					break;
				case 5:
					break menu;
				default:
					System.out.println("Invalid input");
			}
		}
	}
}


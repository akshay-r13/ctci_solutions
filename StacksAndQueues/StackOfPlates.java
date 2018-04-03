import stack.Stack;
import java.util.*;

public class StackOfPlates{
	public static class SetOfStacks<T>{
		ArrayList<Stack<T>> aos;
		public int count;
		int limit;
		int stackCount;
		public SetOfStacks(int limit){
			this.count = 0;
			this.limit = limit;
			aos = new ArrayList<Stack<T>>();
			aos.add(new Stack());
			this.stackCount = 1;
		}
		public void push(T data){
			int stackIndex = count/limit;
			if(stackIndex>aos.size()-1){
				aos.add(new Stack());
				this.stackCount++;
			}
			aos.get(stackIndex).push(data);
			count++;
			System.out.println("count : "+count);
		}
		public T pop() throws EmptyStackException{
			int index = stackCount-1;
			if(stackCount==0)throw new EmptyStackException();
			T item = aos.get(index).pop();
			if(aos.get(index).isEmpty())stackCount--;
			return item;
		}
		public T popAt(int index) throws EmptyStackException,IndexOutOfBoundsException {
			T item = aos.get(index).pop();
			return item;
		}
		public void print(){
			for(Stack<T> s : aos){
				try{
					s.print();
				}
				catch(EmptyStackException e){
					System.out.println("Stack is empty");
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter limit for a stack : ");
		SetOfStacks<Integer> sos = new SetOfStacks<Integer>(in.nextInt());
menu:
		while(true){
			System.out.println("1. Print stacks");
			System.out.println("2. Push to stacks");
			System.out.println("3. Pop from stacks");
			System.out.println("4. Pop at Stack");
			System.out.println("5. Exit");
			switch(in.nextInt()){
				case 1:
					sos.print();
					break;
				case 2:
					System.out.print("Enter data to be pushed : ");
					sos.push(in.nextInt());
					break;
				case 3 :
					try{
						System.out.println("Popped from stack : " + sos.pop());
					}catch(EmptyStackException e){
						System.out.println("Cannot pop stacks are empty");
					}
					break;
				case 4:
					System.out.println("Enter stack number to be popped");
					try{
						sos.popAt(in.nextInt());
					}catch(IndexOutOfBoundsException e){
						System.out.println("Invalid index");
					}
					catch(EmptyStackException e){
						System.out.println("Cannot pop stack is empty");
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

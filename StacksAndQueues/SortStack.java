import stack.SortedStack;
import java.util.*;

public class SortStack {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of stack : ");
		int n = in.nextInt();
		SortedStack s = new SortedStack();
		while(n-->0){
			System.out.print("Enter element : ");
			s.push(in.nextInt());
		}
menu:
		while(true){
			System.out.println("Enter your choice:");
			System.out.println("1. Print stack");
			System.out.println("2. Push to stack");
			System.out.println("3. Pop from stack");
			System.out.println("4. Peek at stack");
			System.out.println("5. Exit");
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
					break menu;
			}
		}
	}
}	

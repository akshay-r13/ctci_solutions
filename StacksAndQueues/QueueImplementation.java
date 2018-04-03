import queue.Queue;
import java.util.*;

public class QueueImplementation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Queue<Integer> q = new Queue<Integer>();
menu:
		while(true){
			System.out.println("1. Add to Queue");
			System.out.println("2. Remove from Queue");
			System.out.println("3. Peek at Queue");
			System.out.println("4. Print Queue");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			switch(in.nextInt()){
				case 1:
					System.out.print("Enter number to add : ");
					q.add(in.nextInt());
					break;
				case 2:
					try{
						System.out.println("Removed : " + q.remove());
					}catch(NoSuchElementException e){
						System.out.println("Queue is empty");
					}
					break;
				case 3:
					try{
						System.out.println("First in queue : " +  q.peek());
					}catch(NoSuchElementException e){
						System.out.println("Queue is empty");
					}
					break;
				case 4:
					try{
						System.out.println("Your Queue :");
						q.print();
					}catch(NoSuchElementException e){
						System.out.println("Queue is empty");
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

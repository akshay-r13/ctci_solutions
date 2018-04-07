import java.util.Scanner;

import linkedlist.LinkedList;

public class LinkedListImplementation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<Integer>();
menu:
		while(true){
			System.out.println("1. Add element");
			System.out.println("2. Remove element");
			System.out.println("3. Print List");
			System.out.println("4. Add at index");
			System.out.println("5. Remove at index");
			System.out.println("6. Exit");
			int ch = in.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter data : ");
					l.insert(in.nextInt());
					break;
				case 2:
					System.out.println("Removed data : " + l.remove());
					break;
				case 3:
					l.print() ;
					break;
				case 4:
					System.out.print("Enter Data and Index : ");
					l.insertAt(in.nextInt(),in.nextInt());
					break;
				case 5:
					System.out.print("Enter index : ");
					l.removeAt(in.nextInt());
					break;
				case 6:
					break menu;
				default:
					System.out.println("Invalid input");
			}
		}
	}
}


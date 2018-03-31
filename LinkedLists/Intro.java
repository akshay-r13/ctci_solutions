import java.util.Scanner;
import node.Node;

public class Intro {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Node head = new Node();
		Node n = head;
		System.out.print("Enter number of elements to be inserted : ");
		int c = in.nextInt();
		while(c-->0){
			n.data = in.nextInt();
			n.next = new Node();
			n = n.next;
		}
		Node pn = head;
		System.out.println("Your list");
		while(pn.next!=null){
			System.out.print(pn.data + " ");
			pn = pn.next;
		}
		System.out.print("\n");
	}
}		

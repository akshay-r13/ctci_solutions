import node.Node;
import java.util.*;

public class KtoL {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter data to be inserted");
		System.out.println("Enter x to exit");
		Node head = new Node();
		Node n = head;
		int count=0;
		while(true){
			try{
			int data = in.nextInt();
			n.data = data;
			n.next = new Node();
			n = n.next;
			count++;
			}
			catch(InputMismatchException ime){
				in.nextLine();
				System.out.println("Exiting loop...");
				break;
			}
		}
		n = head;
		System.out.println("Your List :");
		while(n.next!=null){
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print("\nEnter Kth to last element to be retrieved : ");
		int k = count-in.nextInt();
		n = head;
		if(k<1){
			System.out.println("Invalid k");
		}else{
			while(k-->0){
				n = n.next;
			}
			System.out.println("Element retrieved  : " + n.data);
		}
	}
}

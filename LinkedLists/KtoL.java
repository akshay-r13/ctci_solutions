import node.Node;
import java.util.*;

public class KtoL {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		in.delimitter();
		System.out.println("Enter data to be inserted");
		System.out.println("Enter no data to exit");
		Node head = new Node();
		Node n = head;
		int count=0;
		while(in.hasNextInt()){
			try{
			int data = in.nextInt();
			n.data = data;
			n.next = new Node();
			n = n.next;
			count++;
			}
			catch(InputMismatchException ime){
				System.out.println("Exiting loop...");
				break;
			}
		}
		System.out.print("Enter Kth to last element to be retrieved : ");
		int k = count - in.nextInt()-1;
		n = head;
		if(k<=0){
			System.out.println("Invalid k");
		}else{
			while(k-->0){
				n = n.next;
			}
		}
		System.out.println("Element retrieved  : " + n.data);

	}
}

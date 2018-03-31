import java.util.*;
import node.Node;

class RemoveDups {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int c = in.nextInt();
		Node head = new Node();
		Node n = head;
		System.out.println("Enter data");
		while(c-->0){
			n.data = in.nextInt();
			n.next = new Node();
			n = n.next;
		}
		System.out.println("Your List :");
		n = head;
		while(n.next!=null){
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println("\nRemoving duplicates.....");
		Node p1 = head;
		while(p1.next!=null){
			Node p2 = p1;
			while(p2.next!=null){
				if(p1.data == p2.next.data){
					if(p2.next.next==null){
						p2.next=null;
					}else{
						p2.next = p2.next.next;
					}
				}
				p2 = p2.next;
			}
			p1 = p1.next;
		}
		System.out.println("Modified List :");
		n = head;
		while(n.next!=null){
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print("\n");

	}
}

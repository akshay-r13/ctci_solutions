import java.util.*;
import node.CharNode;

public class DeleteNode {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		CharNode head = new CharNode(),n;
		System.out.print("Enter number of elements : ");
		int i = in.nextInt();
		System.out.println("Enter the characters :");
		for(n=head;i>0;i--,n=n.next){
			n.data = in.next().charAt(0);
			n.next = new CharNode();
		}
		System.out.println("Your List : ");
		for(n = head;n.next!=null;n=n.next)
			System.out.print(n.data + " ");
		System.out.print("\nEnter character to be deleted from the middle nodes : ");
		char c = in.next().charAt(0);
		for(n = head;n.next.next!=null;n=n.next)
			if(n.next.data == c)
				n.next = n.next.next;
		System.out.println("Your modified list :");
		for(n=head;n.next!=null;n=n.next)
			System.out.print(n.data + " ");
		System.out.print("\n");
	}
}


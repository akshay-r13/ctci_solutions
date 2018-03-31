import java.util.*;
import node.Node;

public class Partition {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Node head = new Node(),n;
		System.out.print("Enter the number of elements :");
		int i=in.nextInt();
		System.out.println("Enter the numbers :");
		for(n=head;i-->0;n=n.next){
			n.data = in.nextInt();
			n.next = new Node();
		}
		System.out.print("Enter partition element : ");
		int partition = in.nextInt();
		Node lnode = new Node(),l;
		Node rnode = new Node(),r;
		for(n=head,l=lnode,r=rnode;n.next!=null;n=n.next){
			if(n.data<partition){
				l.data = n.data;
				l.next = new Node();
				l = l.next;
			}else{
				r.data = n.data;
				r.next = new Node();
				r = r.next;
			}
		}
		l.data = rnode.data;
		l.next = rnode.next;
		System.out.println("Modified list:");
		for(l=lnode;l.next!=null;l=l.next)
			System.out.print(l.data + " ");
	}
}

import java.util.Scanner;
import node.Node;

class Sum {
	public static Node createList(){
		Node head = new Node();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int i = in.nextInt();
		for(Node n=head;i-->0;){
			System.out.print("Enter Element : ");
			n.data = in.nextInt();
			if(i!=0){
				n.next = new Node();
				n = n.next;
			}
		}
		return head;
	}
	public static void printList(Node head){
		System.out.println("Your list :");
		for(Node n=head;n!=null;n=n.next)
			System.out.print("->" + n.data);
		System.out.print("\n");	
	}
	public static int sumList(Node head){
		int sum=0,i=0;
		for(Node n=head;n!=null;n=n.next)
			sum=sum+n.data*(int)Math.pow(10,i++);
		return sum;
	}

	public static void main(String[] args){
		int num1,num2;
		Node list1=new Node(),list2=new Node(),n;
		System.out.println("List 1");
		list1 = createList();
		printList(list1);
		System.out.println("List 2");
		list2 = createList();
		printList(list2);
		num1 = sumList(list1);
		num2 = sumList(list2);
		System.out.println("Number 1 : " + num1);
		System.out.println("Number 2 : " + num2);
		System.out.println("Sum : " + (num1+num2));
	}
}

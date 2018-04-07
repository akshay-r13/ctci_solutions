import linkedlist.LinkedList;
import java.util.*;

public class Palindrome {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> temp = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		System.out.println("Enter number of elements : ");
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			int x = in.nextInt();
			l1.insert(x);
			temp.insert(x);
		}
		l1.print();
		while(temp.size() > 0){
			l2.insert(temp.remove());
		}
		l2.print();
		if(l1.equals(l2))
			System.out.println("Palindrome");
		else
			System.out.println("Not in a palindrome");
	}
}


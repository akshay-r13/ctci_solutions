import java.util.Scanner;

public class MagicNumber {
	public static int binarySearchMagicNumber(int[] a,int l, int h){
		int m = (l+h)/2;
		if(a[m] == m)
			return m;
		if(l==h)
			return -1;
		return(Math.max(binarySearchMagicNumber(a,l,m) ,binarySearchMagicNumber(a,m+1,h)));
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int a[] = new int[in.nextInt()];
		System.out.println("Enter sorted array");
		int prev = 0;
		for(int i=0;i<a.length;i++){
			a[i] = in.nextInt();
			if(i > 0 && a[i] < prev){
				System.out.println("Invalid input");
				return;
			}
			prev = a[i];
		}
		System.out.println("Your array :");
		for(int x : a)
			System.out.print(x + " ");
		System.out.println("Finding Magic number through binary search ... ");
		System.out.println("Magic number : " + binarySearchMagicNumber(a,0,a.length-1));
	}
}

import java.util.*;

class OneAway {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string 1 : ");
		char[] a1 = in.nextLine().toCharArray();
		System.out.print("Enter string 2 : ");
		char[] a2 = in.nextLine().toCharArray();
		int count=0;
outerLoop:
		for(int i=0;i<a1.length;i++){
innerLoop:
			for(int j=0;j<a2.length;j++){
				if(a1[i] == a2[j])
					a1[i]=0;
					a2[j]=0;
					continue outerLoop;
			}
			count++;
		}
		System.out.println("Differences : " + count);
	}
}

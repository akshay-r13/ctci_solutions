import java.util.*;

public class CheckPermutation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String 1 : ");
		String s1 = in.next().toLowerCase();
		System.out.print("Enter String 2 : ");
		String s2 = in.next().toLowerCase();
		ArrayList<String> list = new ArrayList<String>();
		list = getPermutations(s1,0,s1.length()-1);
		if(list.contains(s2))
			System.out.println("Is permutation");
		else
			System.out.println("Not permutation");
	}

	public static ArrayList<String> getPermutations(String str,int l,int r){
		ArrayList<String> list = new ArrayList<String>();
		if(l==r){
			System.out.println(str);
			list.add(str);
			return list;
		}	
		else{
			for(int i=l;i<=r;i++){
				str = swap(str,l,i);
				list.addAll(getPermutations(str,l+1,r));
				str = swap(str,l,i);
			}
		}
		return list;
	}
	public static String swap(String s,int i,int j){
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return String.valueOf(a);
	}
}

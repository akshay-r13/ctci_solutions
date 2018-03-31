import java.util.*;

class PalindromePermutation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string to be permutated : ");
		String s = in.nextLine();
		ArrayList<String> palindromes = palindromePermute(s,0,s.length()-1);
		System.out.println("Palindrome Permutations : ");
		for(String palindrome : palindromes)
			if(isPalindrome(palindrome))
				System.out.println(palindrome);
		System.out.println("Number of permutations : " + palindromes.size());
	}

	public static ArrayList<String> palindromePermute(String s,int l,int r){
		ArrayList<String> list = new ArrayList<String>();
		if(l==r){
			list.add(s);
		}
		else{
			for(int i=l;i<=r;i++){
				s = swap(s,l,i);
				list.addAll(palindromePermute(s,l+1,r));
				s = swap(s,l,i);
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

	public static boolean isPalindrome(String s){
		StringBuffer bf = new StringBuffer(s);
		if(s.equals(bf.reverse().toString()))
			return true;
		return false;
	}
}

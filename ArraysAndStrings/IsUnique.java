import java.util.*;

public class IsUnique {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string to be checked for uniqueness : ");
		String s = in.next().toLowerCase();
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			char c = arr[i];
			for(int j=0;j<arr.length;j++){
				if(j==i)continue;
				if(arr[j]==arr[i]){
					System.out.println("Not unique");
					return;
				}
			}
		}
		System.out.println("Is unique");
	}
}

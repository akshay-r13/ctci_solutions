import java.util.*;
import java.util.regex.*;

class urlify {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string to be URLified : ");
		String s = in.nextLine();
		String regex = "\\s+";
		String replacement = "%20";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		StringBuffer buff = new StringBuffer();
		while(m.find()){
			m.appendReplacement(buff,replacement);
		}
		m.appendTail(buff);
		System.out.println(buff.toString());
	}
}

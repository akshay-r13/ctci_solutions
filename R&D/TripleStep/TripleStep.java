import java.util.*;

public class TripleStep {
	public static int findSteps(int steps){
		if(steps==0)return 1;
		if(steps<0)return 0;
		return(findSteps(steps-1)+findSteps(steps-2)+findSteps(steps-3));
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of steps in the staircase : ");
		int n = in.nextInt();
		System.out.println("The number of ways the child could climb " + n + " steps 1, 2 and 3 are : " + findSteps(n));
	}
}


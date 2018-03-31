import java.util.*;

class RotateMatrix {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter matrix dimension (N) : ");
		int N = in.nextInt();
		System.out.println("Enter the matrix elements :");
		int[][] mat = new int[N][N];
		for(int j=N-1;j>=0;j--)
		       for(int i=0;i<N;i++)
			       mat[i][j] = in.nextInt();
		System.out.println("Rotating right 90deg :");
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++)
				System.out.print(mat[i][j] + " ");
			System.out.print("\n");
		}
	}
}

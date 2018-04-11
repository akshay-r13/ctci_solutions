import java.util.*;

public class RoboGrid {
	private static char empty = '\u25A1';
	private static char wall = '\u25A0';
	private static char visited = '\u25A8';

	public static void printGrid(char[][] grid){
	System.out.println(" Your grid : ");
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid.length;j++)
				System.out.print(grid[i][j] + " ");
			System.out.println("\n");
		}	
	}
	public static boolean findRoute(int i,int j,char[][] grid){
		grid[i][j] = visited;
		int n = grid.length - 1;
		boolean right = false , down = false;
		if(i==n && j==n){
			printGrid(grid);
			return true;
		}else{
			if(i<n && grid[i+1][j] == empty)
				down = findRoute(i+1,j,grid);
			if(j<n && grid[i][j+1] == empty)
				right = findRoute(i,j+1,grid);
			if(!(right || down))
				grid[i][j] = empty;
			return right || down;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the grid : ");
		int n = in.nextInt();
		char grid[][] = new char[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				grid[i][j] = ((int)(Math.random()*10) > 7)?wall:empty;
		grid[0][0] = empty;
		grid[n-1][n-1] = empty;
		printGrid(grid);
		if(findRoute(0,0,grid))
			System.out.println("Yes there is a route");
		else
			System.out.println("There is no route");
	}
}

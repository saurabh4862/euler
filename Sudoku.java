import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class Sudoku {
	int sum=0;
	public void solveSudoku(int[][] board) {
		solve(board, 0);
	}

	private boolean solve(int[][] grid,int ind)
	{
		if (ind==81)
		{
			sum=sum+100*grid[0][0]+10*grid[0][1]+grid[0][2];
			return true;
		} 
		else
		{
		int row =ind/9;
		int col =ind%9;
		if (grid[row][col]!=0){
			 return solve(grid,ind+1);
		}	
		else
		{
			for(int i=1;i<=9;i++){
				if (check(i,grid,row,col)){
					grid[row][col]=i;
				if(solve(grid, ind+1)) 
					return true;
				else
					grid[row][col] = 0;
				}
			}   
		}

		return false;
		}
	}
	public boolean check(int a,int[][] ar,int m,int n)
	{
		boolean c=true;
		for (int i=0;i<9;i++)
		{
			if (ar[i][n]==a)
			{
				c=false;
			}
			if (ar[m][i]==a)
			{
				c=false;
			}
		}
		for (int i=m-m%3;i<m+3-m%3;i++)
		{
			for (int j=n-n%3;j<n+3-n%3;j++)
			{
				if (ar[i][j]==a)
				{
					c=false;
				}
			}
		}
		return c;		
	}
	public static void main(String[] args) throws IOException
	{
		Sudoku e= new Sudoku();		
		Scanner s = new Scanner(new File("p096_sudoku.txt"));
		for (int i=0;i<50;i++)
		{
			s.nextLine();
			int[][] grid= new int[9][9];
			for(int j = 0; j < 9; j++)
			{
				String n = s.nextLine();
				char[] nn = n.toCharArray();
				for(int k = 0; k < 9; k++){
					grid[j][k] = nn[k] - '0';
				}
			}
			e.solveSudoku(grid);
			//System.out.println(e.sum);
		}
		System.out.println(e.sum);
	}
}

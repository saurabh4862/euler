import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.io.IOException;
public class Euler67{

    public static void main(String[] args) throws IOException{
			Scanner in= new Scanner(new File("p067_triangle.txt"));
			int ar[][] = new int[100][100];
			for(int i=0; i<100; i++){
				for(int j=0; j<=i; j++){
					ar[i][j] = in.nextInt();
				}
			}
			for(int i=99; i>0; i--){				
				for(int j=0; j<i; j++){
					if(ar[i][j] > ar[i][j+1]){	
						ar[i-1][j] = ar[i-1][j] + ar[i][j];
					}
					else{
						ar[i-1][j] = ar[i-1][j] + ar[i][j+1];
					}
				}
			}
			System.out.println(ar[0][0]);
		}
}

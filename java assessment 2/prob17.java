import java.util.Scanner;
class prob17
{
public static void main(String args[])
{
		int x=Integer.parseInt(args[0]);
		int[][] a=new int[x][x];
		System.out.println("enter square matrix of size"+x+"\n");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<x;i++)
		{for(int j=0;j<x;j++)
			{
			a[i][j]=sc.nextInt();
		}}
		System.out.println("\nthe diagonal elements are: ");
		
		for(int i=0;i<x;i++)
		{
			System.out.println("\n"+a[i][i]);
		}
		
}
}

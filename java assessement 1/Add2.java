import java.util.Scanner;
import java.lang.*;

class Add2
{
 public static void main(String args[])
	{
		int a,b,n;
		Scanner sc=new Scanner(System.in);
		b=0;
		System.out.println("Enter the total number of quantities: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{System.out.println("Enter next number: ");
		 a=sc.nextInt();
		 b=b+a;
		}	
		System.out.println("The sum of all the numbers is: "+ b);
		

	}
}
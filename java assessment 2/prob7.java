import java.util.Scanner;
class prob7
{
public static void main(String args[])
{
		
		int n=args.length;
		if(n>=2){
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("enter next array of size"+n+"\n");
		int[] b=new int[n];
		
		for(int i=0;i<n;i++)
		{
			b[i]=new Scanner(System.in).nextInt();
		}
		if(a[0]==b[0])
		System.out.println("True");
		else
		System.out.println("False");		

		}
		else
		System.out.println("array must be larger in size");
}
}

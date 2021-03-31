import java.util.Scanner;
class prob8
{
public static void main(String args[])
{
		
		int[] a=new int[3];
		for(int i=0;i<3;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("enter next array of size 3\n");
		int[] b=new int[3];
		
		for(int i=0;i<3;i++)
		{
			b[i]=new Scanner(System.in).nextInt();
		}
		int[] c=new int[2];
		c[0]=a[0];
		c[1]=b[2];
		System.out.println("the third array would be : "+c[0]+" "+c[1]);
}
}

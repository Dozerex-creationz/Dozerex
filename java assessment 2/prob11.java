
class prob11
{
public static void main(String args[])
{
		
		int[] a=new int[3];
		for(int i=0;i<3;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			
		}
		
		if(a[0]<a[1])
		a[0]=a[1];
		if(a[0]<a[2])
		a[0]=a[2];	
		System.out.println("\n"+a[0]);
}
}

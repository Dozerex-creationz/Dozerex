
class prob3
{
	public static void main(String args[])
	{
		int n=args.length;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
			int temp=0;
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
		}
		
		if(n%2==0)
		{
		for(int i=0;i<n/2;i++)
		{
		System.out.println(" "+a[n-i-1]);
		System.out.println(" "+a[i]);
		}
		System.out.println(" "+a[n/2]);
		}
		else
		{int r=(n+1)/2;
		for(int i=0;i<r;i++)
		{
		System.out.println(" "+a[n-i-1]);
		System.out.println(" "+a[i]);
		}
		


		}
	}
}

class prob4
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
			if(a[j]%2!=0)
			{
			int temp=0;
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
		}
		
		


		for(int i=0;i<n;i++)
		{
		System.out.println(" "+a[i]);
		}
	}
}
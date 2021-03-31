class prob1
{
	public static void main(String args[])
	{
		int n=args.length;
		System.out.println("the n is:"+n+"\n");
		int []a=new int[n];
		for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(args[i]);
			}
		for(int i=0;i<n;i++)
		{	for(int j=0;j<n-1;j++)
			{	
				int temp=0;
				if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}	
			}
		}
		for(int i=0;i<n;i++)
			{
				System.out.println("\n"+a[i]);
			}
		System.out.println("\nThe third largest number in the array is"+a[n-3]);
	}
}
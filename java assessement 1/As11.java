class As11
{
 public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		long x=a;
		for(int i=1;i<a;i++)
		{
			x=x*i;					
		

		}
		System.out.println("the factorial of the number is: "+x);
	}
}
class As7
{
 public static void main(String args[])
	{	int x=0;
		int a=Integer.parseInt(args[0]);
		for(int i=0;i<4;i++)
		{
			x=x+(a%10);
			a=a/10;	


		}
		System.out.println("the sum of the digits is :"+x);
	}
}
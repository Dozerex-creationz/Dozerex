class As
{
 public static void main(String args[])
	{
		int a,b,x=0;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		if(a>b)
		{
			 for(int i=0;i<b;i++)
				{
					x=x+a;	
				}
			
		}
		else
		{
			for(int i=0;i<a;i++)
				{
					x=x+b;	
				}
				
		}
		System.out.println("the product is :"+x);
	}
	

}
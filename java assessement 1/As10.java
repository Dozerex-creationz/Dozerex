class As10
{
 public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int x=0,y,temp;
		y=1;
		System.out.println(y+"\n");
		for(int i=0;i<a-1;i++)
		{	temp=y;
			y=y+x;
			x=temp;	
			System.out.println(y+"\n");
			
		}
	}
}
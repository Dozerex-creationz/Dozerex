class As20
{
public static void main(String args[])
{	int count=0;
	int a=Integer.parseInt(args[0]);
	for(int i=0;i<a;i++)
	{	
	count=count+(i*i);		

	}
	System.out.println("the sum is :"+count);
}

}
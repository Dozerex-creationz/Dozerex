
class prob9
{
public static void main(String args[])
{
		
		int[] a=new int[2];
		for(int i=0;i<2;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(a[i]==4 ||a[i]==7)
				{System.out.println("true");
				return;}
		}
		System.out.println("false");
}
}

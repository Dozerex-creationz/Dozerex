
class prob12
{
public static void main(String args[])
{
		
		int[] a=new int[3];
		for(int i=0;i<3;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			
		}
			int temp=a[0];
			a[0]=a[2];
			a[2]=temp;
		System.out.println("\n"+a[0]+" "+a[1]+" "+a[2]+" ");
}
}

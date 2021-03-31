class prob5
{
public static void main(String args[])
{
		
		int n=args.length;
		if(n>=2){
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		if(a[0]==a[n-1])
		System.out.println("True");
		else
		System.out.println("False");		

		}
		else
		System.out.println("array must be larger in size");
}
}
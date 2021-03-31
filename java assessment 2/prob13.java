
class prob13
{
public static void main(String args[])
{
		int n=args.length;
		if(n%2 !=0)
{
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			
		}
		int x=max(a,n);	
		System.out.println(x);
}
		else
		System.out.println("enter evenly sized array");
			
}
public static int max(int[] a,int r)
{int x=(r+1)/2;
r=r-1;
if(a[0]<a[r])
a[0]=a[r];

if(a[0]<a[x])
return a[x];

return a[0];	
} 
}

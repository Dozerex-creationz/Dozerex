class prob18
{
public static void main(String args[])
{		String s=new String("");
		for(int i=1;i<5;i++)
		{
			s=s+i;
			System.out.println(s);	
		}
		StringBuffer sb= new StringBuffer(s);
		for(int i=1;i<5;i++)
		{
			System.out.println(sb);  
			sb.deleteCharAt(sb.length()-1);	
		}
}
}

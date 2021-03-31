package pack1.pack2;

public class Length
{

	public static void strLength(String s)
	{
		int l=0;
  		char[] str=s.toCharArray();
  		for(char c:str)
  		{
   		l++;
  		}
		System.out.println("\nthe legth of the string is :"+l);
	}
}


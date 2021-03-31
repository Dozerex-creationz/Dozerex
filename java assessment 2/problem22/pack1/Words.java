package pack1;
import java.util.*;
public class Words
{
	public static void countNumWords(String s)
	{   	int r=1;
		
			for(int i=0;i<s.length();i++)
			{	if(s.charAt(i)==' ')
				r=r+1;
			}
		System.out.println("\nthe number of words are :"+ r);
	}
	
}
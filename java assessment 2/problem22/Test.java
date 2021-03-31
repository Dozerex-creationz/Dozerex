import pack1.Words;
import pack1.pack2.Length;

public class Test
{
public static void main(String args[])
{
	String a=new String("this is me dozerex");
	System.out.println("The string is :"+a);
	Words.countNumWords(a);
	Length.strLength(a);
}
}
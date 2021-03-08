
import java.util.*;

class Pro
{

public static void main(String args[])
{  programs.Calc C=new programs.Calc();
   int a,b,d,e,f,g;
   a=Integer.parseInt(args[0]);	

   b=Integer.parseInt(args[1]);	
  	
   d=C.add(a,b);
 e=C.sub(a,b);
f=C.mult(a,b);
g=C.div(a,b);	
System.out.println(d+"\n"+e+"\n"+f+"\n"+g+"\n");

}
}
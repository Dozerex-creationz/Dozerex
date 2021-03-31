import java.util.Scanner;
public class Employee
{
 String name;
 String empid;
 long salary;


 public void disp()
{
 System.out.println(" the name :"+name+"\nthe empid: "+empid);
}
}

class Prob20
{
public static void main(Strig args[])
{
	System.out.println("enter the number of employees");
	Scanner sc= new Scanner(System.in);
	int r=sc.nextInt();
	Employee[] e=new employee[r];
	for(int i=0;i<r;i++)
{
	System.out.println("enter the employee's name :\n");
	e[i].name=sc.nextLine();	
	System.out.println("enter the Id :\n");
	e[i].empid=sc.nextLine();
	System.out.println("enter the salary :\n");
	e[i].salary=sc.nextLong();
}
	for(int i=0;i<r;i++)
{
	if(e[i].salary<100000)
		e[i].disp();
}
}
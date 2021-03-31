import java.util.Scanner;

class prob20
{
public static void main(String args[])
{
	System.out.println("enter the number of employees");
	Scanner sc= new Scanner(System.in);
	int r=sc.nextInt();
	Employee[] e=new Employee[r];
	String[] x=new String[3];
	for(int i=0;i<r;i++)
{
	System.out.println("enter the employee's name and Id:");
	x[0]=sc.nextLine();
x[1]=sc.nextLine();x[2]=sc.nextLine();	
	System.out.println("enter the salary :");
	long z=sc.nextLong();
	e[i]=new Employee(x[1],x[2],z);
	
}
	for(int i=0;i<r;i++)
{
	if(e[i].salary<100000)
		
		System.out.println(" the name :"+e[i].name+"\nthe empid: "+e[i].empid);

}
}
}
class Employee
{
 String name;
 String empid;
 long salary;
 

Employee(String n,String m,long s)
{
 name=n;
 empid=m;
 salary=s;
}



}

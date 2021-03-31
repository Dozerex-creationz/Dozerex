import java.util.*;
class Student
{	
	String regNo=new String();
  	String name=new String();
	float cgpa;
	String prog=new String();
	String school=new String();
	String proctor=new String();
	
	
	public void read()
{
	Scanner sc=new Scanner(System.in);
	this.regNo=sc.nextLine();	
	this.name=sc.nextLine();	
	this.cgpa=Float.parseFloat(sc.nextLine());
	this.prog=sc.nextLine();
	this.school=sc.nextLine();
	this.proctor=sc.nextLine();
}
	public void display()
{
	System.out.println("\nRegistration number:"+this.regNo+"\nName:"+this.name+"\nCGPA:"+this.cgpa+"\nProgramme Name:"+this.prog+"\nSchool Name:"+this.school+"\nProctor Name :"+this.proctor);

}
}
class prob2
{
	public static void main(String args[])
	{
		Student st=new Student();
		st.read();
		st.display();
	}
}
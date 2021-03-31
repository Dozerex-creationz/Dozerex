import java.util.Scanner;
class Student
{
	String name;
	String regno;
}

class Exam extends Student
{	int[] marks=new int[6];
}

class Result extends Exam
{
  	int totalMarks;
}

class prog22
{

public static void main(String args[])
{
 	Result r=new Result();
	System.out.println("enter the name\n");
	Scanner sc=new Scanner(System.in);
	r.name=sc.nextLine();
	System.out.println("enter the regno\n");
	r.regno=sc.nextLine();
	System.out.println("enter the marks\n");
	for(int i=0;i<6;i++)
{	r.marks[i]=sc.nextInt();
	r.totalMarks+=r.marks[i];
}
	System.out.println("the toal marks is :"+r.totalMarks);
}
}
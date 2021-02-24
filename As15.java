class As15
{
public static void main(String args[])
{
	int j,count=0;
	for(int i=12;i<=50;i=i+3)
	{
		j=(i/10)+(i%10);
		count=count+i;
	}

	System.out.println("the sum of all the digits from 10 to 50 that are divisibke by 3 is :"+count);



}

}
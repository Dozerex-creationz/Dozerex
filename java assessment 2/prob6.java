import java.util.Scanner;
class prob6
{
public static void main(String args[])
{
	System.out.println("1.bin to decimal\n2.decimal to bin" );
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	switch(x)
	{
	case 1:
		System.out.println("enter the number");
		long b=(long)sc.nextInt();
		convertBinaryToDecimal(b);
		break;
	case 2:
		System.out.println("enter the number");
		int d=sc.nextInt();
		convertDecimalToBinary(d);
		break;
	default:
		System.out.println("enter a valid entry");
	}
		
}


public static void convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    System.out.println("the decimal number is:"+decimalNumber);
  }


public static void convertDecimalToBinary(int n) {
    long binaryNumber = 0;
    int remainder, i = 1, step = 1;

    while (n!=0) {
      remainder = n % 2;
       	n /= 2;
        binaryNumber += remainder * i;
        i *= 10;
    }
    
    System.out.println("the binary number is :"+binaryNumber);
    }

}
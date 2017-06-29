package guvi;
import java.util.Scanner;
public class FactorialNo {
public static void main(String args[])
{
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	int fact=1;
	for(int i=1;i<=a;i++)
	{
		fact=fact*i;
	}
	System.out.println("the factorial of "+a+" is : "+fact);
	s.close();
}
}

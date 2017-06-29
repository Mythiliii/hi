package guvi;
import java.util.Scanner;
public class Hcf {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		a=s.nextInt();
		System.out.println("Enter the second number : ");
		b=s.nextInt();
		while(b!=0)
		{
			c=a%b;
			a=b;
			b=c;
		}
		System.out.println("the HCF is : "+a);
		s.close();
	}

}

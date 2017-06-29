package guvi;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[])
	{
		int a=0,b=1,c,i;
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		System.out.print(a+" "+b);
		for(i=2;i<m;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		s.close();
	}

}

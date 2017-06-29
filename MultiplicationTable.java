package guvi;
import java.util.Scanner;
public class MultiplicationTable 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println();
		int a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
		System.out.println(i+"*"+a+"="+i*a);
		}
	    s.close();
	}
}

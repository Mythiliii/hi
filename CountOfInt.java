package guvi;
import java.util.Scanner;
public class CountOfInt
{
	public static void main(String args[])
	{
		int a,count=0;
		System.out.println("enter any no : ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=0;i<=a;i++)
		{
			count=i+count;			
		}
		System.out.println("the count of integers : "+count);
		s.close();
	}

}

package positive;
import java.io.*;
import java.util.Scanner;
public class Positive {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>=0)
		{
			System.out.println("the given no is positive");
		}
		else
		{
		System.out.println("the given no is negative");
		}
		s.close();
	}
}

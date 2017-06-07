package positive;
import java.io.*;
import java.util.Scanner;
public class largest {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && b>c)
		{
			System.out.println("a is largest");
		}else 
		 {
			if(b>c && c>a)
			 {
			   System.out.println("b is largest");
		     }else
		     {
          		System.out.println("c is largest");
		     }
	     }
}
}
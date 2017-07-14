import java.util.*;
public class Aaa {
	public static void main(String args[])
	{
		int x,fact=1;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of"+x+"is : "+fact);
		s.close();
	}

}

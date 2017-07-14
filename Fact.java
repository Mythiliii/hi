import java.util.*;
public class Fact {
	public static void main(String args[])
	{
		int a,fact=1;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of"+a+"is : "+fact);
		s.close();
	}

}

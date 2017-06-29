package guvi;
import java.util.Scanner;
public class ReverseNo {
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a>0)
		{
			b=a%10;
			System.out.print(b);
			a=a/10;
		}
		s.close();
	}

}

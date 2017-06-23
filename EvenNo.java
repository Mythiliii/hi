import java.util.Scanner;
public class EvenNo {
	public static void main(String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any interval : ");
		a=s.nextInt();
		System.out.println("enter the interval between 1 to "+ a);
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
		s.close();
	}

}

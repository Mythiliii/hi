package guvi;
import java.util.Scanner;
public class HelloWord {
	public static void main(String args[])
	{
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	for(int i=0;i<a;i++)
	{
		System.out.println("hello");
	}  
	s.close();
}
}

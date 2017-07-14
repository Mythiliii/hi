import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) 
	{
		String str; 
		System.out.println("Enter the string: ");
		Scanner s=new Scanner(System.in);
		str =s.next();
	      String reverse = new StringBuffer(str).reverse().toString();
	      System.out.println("\n String before reverse: "+str);
	      System.out.println("\n String after reverse: "+reverse);
	      s.close();
	   }
}

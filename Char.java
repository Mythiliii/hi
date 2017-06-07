package positive;
import java.io.*;
import java.util.Scanner;
public class Char {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if((c>='a' && c<='z')||(c>'A' && c<='Z'))
		{
			System.out.println("the given is alphabets");
		}else
		{
			System.out.println("the given is not alphabets");
		}
		s.close();
	}

}

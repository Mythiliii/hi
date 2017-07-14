import java.util.*;
public class StringToInt {
	 public static void main(String []args){
		    String str;
		    Scanner s=new Scanner(System.in);
		    str=s.next();
		    int a = Integer.parseInt(str);
		    System.out.println("Actual String:"+ str);
		    System.out.println("Converted to Int:" + a);
		    System.out.println("Arithmetic Operation on Int:" + (a/4));
		    s.close();
		  }
}

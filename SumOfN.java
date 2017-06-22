package guvi;

import java.util.Scanner;

public class SumOfN {
	 public static void main(String arg[])
	    {
	        int a;
	        int sum = 0;
	        System.out.println("Enter Number of items :");
	        Scanner s = new Scanner(System.in);
	        a=s.nextInt();
	        for(int i = 1; i <= a; i++)
	        {
	            sum = sum + i;    // LINE A
	            System.out.println("Sum after adding " + i + " is : " + sum); 
	        }
	        
	        System.out.println();
	        System.out.println("Sum of numbers till " + a + " is " + sum); // LINE B
	    s.close();
	    }
}

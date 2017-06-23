import java.util.Scanner;
public class Odd {
	 public static void main(String[] args) 
	 {
         int limit;
         Scanner a=new Scanner(System.in);
         System.out.println("enter any no :");
         limit=a.nextInt();
         System.out.println("Printing Odd numbers between 1 and " + limit);      
         for(int i=1; i <= limit; i++)
         {                         
                 if( i % 2 != 0)
                 {
                         System.out.print(i + " ");
                 }
         }
         a.close();
 }
}


import java.util.Scanner;
public class PrimeOrNot
{
	public static void main(String args[])
	{  
		  int n,m=0,flag=0;    
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the  no:");
		  n =s.nextInt();
		  m=n/2;    
		  for(int i=2;i<=m;i++)
		  {    
		     if(n%i==0)
		     {    
		        System.out.println("Number is not prime");    
		        flag=1;
		        break ;    
		     }    
		  }   
		  s.close();
		  if(flag==0)   
		  System.out.println("Number is prime");    
		}    
}

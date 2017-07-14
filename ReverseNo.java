import java.util.*;
public class ReverseNo {
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			String a;
			a=s.next();
			int j=a.length();
			j--;
			char str1[]=a.toCharArray();
			char temp;
			for(int i=0;i<str1.length/2;i++){
				temp=str1[i];
				str1[i]=str1[j];
				str1[j]=temp;
				j--;
			}
			a=new String(str1);
			System.out.println(a);
	        s.close();
		}
}

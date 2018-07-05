
import java.util.*;

public class letter {

	public static void main(String[] args)
	{
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           char a[]=s.toCharArray();
           for(int i=0;i<a.length;i++)
           {
        	   if(i%2==0)
        	   {
        		   System.out.print(s.charAt(i+1));
        	   }
        	   else
        	   {
        		   System.out.print(s.charAt(i-1));
        	   }
           }
           
       
           

	}

}


import java.util.*;

public class samepro{
	public static void main(String[] args)
	{
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
            String s1=sc.nextLine();
           
      for(int i=0;i<s1.length();i++)
      {
    	  if(s.charAt(i)==s1.charAt(i))
    	  {
    		  System.out.print(s1.charAt(i));
    	  }
      }
            	
            
	}
}

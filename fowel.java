
import java.util.*;

public class fowel {

	public static void main(String[] args)
	{
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           char b[]= {'a','e','i','o','u'};
            for(int i=0;i<5;i++)
            {  
            	String temp=String.valueOf(b[i]);
              if(s.contains(temp))
            	{
            		s=s.replace(temp,"");
            	}                
            }
           System.out.print(s);
            
          
	}

}

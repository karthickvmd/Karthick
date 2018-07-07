
import java.util.*;

public class alpha {
	public static void main(String[] args)
	{
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           String b[]= {"a","e","i","o","u"};
            for(int i=0;i<5;i++)
            {  
            		s=s.replace(b[i],"");             
            }
           System.out.print(s);       
	}
}

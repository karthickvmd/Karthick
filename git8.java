
import java.util.*;

public class git8 {
	public static void main(String[] args)
	{
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
            String s1[]=s.split(" ");
            for(String w:s1)
            {
            	char a[]=w.toCharArray();
            	for(int i=0;i<a.length;i++)
            	{
            		if(i==0)
            		{
            			System.out.print((Character.toString(a[i]).toUpperCase()));
            		}
            		else
            		{
            			System.out.print((Character.toString(a[i])));
            			
            		}
            	}
            }
	}
}

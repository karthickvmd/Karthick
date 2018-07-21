
import java.io.*;
import java.util.*;

public class same {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String a[]=s.split(" ");
        String h=a[1];
        String q="";
    
       for(int i=0;i<h.length();i++)
       {
          if(!q.contains(Character.toString(h.charAt(i))))
        		  {
        	        q+=h.charAt(i);
        	       // System.out.print(q);
        		  }
          else
          {
        	  System.out.print(Character.toString(h.charAt(i)));
          }
       }
       }

	}



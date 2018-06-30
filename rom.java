
import java.util.*;

public class rom {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   String a[]= {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
	   int l=a.length;
	 
	     if(n<=10)
	     {
	    	 System.out.print(a[n]);
	    	 
	     }
	     else
	     {
	    	 System.out.print(a[l-1]+a[n-10]);
	     }
	 

	}

}

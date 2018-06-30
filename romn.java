
import java.util.*;

public class romn {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   String n=s.nextLine();
	   String a[]= {"","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
	   for(int i=0;i<a.length;i++)
	   {
		   if(n.equals(a[i]))
		   {
			   System.out.print(i);
		   }
	   }
	 
	   
	 

	}

}

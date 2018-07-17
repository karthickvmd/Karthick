
import java.util.*;
public class set2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   
	   int a[]=new int[n];
	   int k=0;
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=sc.nextInt();
	   }
       for(int j=0;j<a.length;j++)
       {
    	   k+=a[j]*a[j];
       }
       System.out.print(k);
	}

}


import java.io.*;
import java.util.*;
public class hunt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		String h="",q="",q1="";
		int m=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			h+=a[i];
		}
		for(int j=0;j<h.length();j++)
		{
		if(!q.contains(Character.toString(h.charAt(j))))
           {
               q+=h.charAt(j);
	       }
		else
		{
			q1=Character.toString(h.charAt(j));
			m=Integer.parseInt(q1);
			System.out.print(m);
		}
		}
}
}

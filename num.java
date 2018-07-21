
import java.io.*;
import java.util.*;
public class num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String h=sc.nextLine();
		int m=0;
		int n=sc.nextInt();
		int l=h.length();
		String k=h.substring(n,l);
		m=Integer.parseInt(k);
		System.out.print(m);

	}

}

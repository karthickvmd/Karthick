import java.io.*;
import java.util.*;
class se
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        HashSet<String> al=new HashSet<String>();
        for(int i=0;i<s1.length();i++)
        {
            al.add(Character.toString(s1.charAt(i)));
        }
        HashSet<String> al1=new HashSet<String>();
        for(int i=0;i<s2.length();i++)
        {
            al1.add(Character.toString(s1.charAt(i)));
        }
        if(al.size()==al1.size())
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
        
    }
}

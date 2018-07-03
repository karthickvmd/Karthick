import java.util.Scanner;
class eve
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int fact=1;
        if(n<=20)
        {
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
        }
        else
        {
        	System.out.print("");
        }
    }
}

import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0,avg,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        avg=sum/n;
        for(i=0;i<n;i++)
        {
            if(avg==x[i])
               count++;
        }
        if(count>0)
           System.out.println("True");
        else
           System.out.println("False");
    }
}
        
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,A,B,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        A=sc.nextInt();
        B=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<A || x[i]>B)
            {
                System.out.print(x[i]+" ");
                count++;
            }
        }
        if(count==0)
          System.out.println("-1");
        sc.close();
    }
}
        
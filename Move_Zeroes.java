import java.util.*;
class Sample
{
    public static void moveZeroes(int x[],int n,int count)
    {
        for(int i=0;i<n;i++)
        {
            if(x[i]==0)
            count++;
            else
            {
                System.out.print(x[i]+" ");
            }
        }
        while(count-->0)
        {
            System.out.print(0+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        moveZeroes(x,n,count);
    }
}
        
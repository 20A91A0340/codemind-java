import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0;
        float avg;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        avg=(float)sum/n;
        System.out.format("%.2f",avg);
    }
}
        
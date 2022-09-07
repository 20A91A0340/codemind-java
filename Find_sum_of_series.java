import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        float sum=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+((float)1/i);
        }
        System.out.format("%.2f",sum);
        sc.close();
    }
}
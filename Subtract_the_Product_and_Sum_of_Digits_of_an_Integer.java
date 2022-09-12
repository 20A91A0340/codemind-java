import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,pro=1,sum=0,r;
        n=sc.nextInt();
        while(n>0)
        {
          r=n%10;
          sum=sum+r;
          pro=pro*r;
          n=n/10;  
        }
        System.out.println(pro-sum);
    }
}
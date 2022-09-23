import java.util.*;
class Sample
{
    public static boolean isPalindrome(int n)
    {
        int temp=n;
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
          return true;
        else
          return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=0,d=0,temp1,temp2;
        int n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            c++;
            if(isPalindrome(i))
            {
                temp1=i;
                break;
            }
        }
        for(int j=n-1;;j--)
        {
            d++;
            if(isPalindrome(j))
            {
                temp2=j;
                break;
            }
        }
        if(d<c)
          {
              System.out.print(temp2);
          }
        else if(c==d)
        {
            System.out.print(temp2+" "+temp1);
        }
        else
        {
            System.out.print(temp1);
        }
    }
}
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,found=0;
        n=sc.nextInt();
        c=a+b;
        while(c<=n)
        {
            if(c==n)
            {
                found=1;
                break;
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(c==n)
          System.out.println("True");
        else
          System.out.println("False");
    }
}
            
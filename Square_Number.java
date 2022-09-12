import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,found=0;
        n=sc.nextInt();
        for(int i=0;i<=(int)Math.sqrt(n);i++)
        {
            for(int j=0;j<=(int)Math.sqrt(n);j++)
            {
                if(i*i+j*j==n)
                {
                    found=1;
                    break;
                }
            }
        }
        if (found==0)
          System.out.println("False");
        else
          System.out.println("True");
          sc.close();
    }
}

import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,k,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
           
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==k)
               c++;
        }
        System.out.println(c);
    }
}

            

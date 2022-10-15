import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr1[i]<=x && arr2[i]>=x)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
            
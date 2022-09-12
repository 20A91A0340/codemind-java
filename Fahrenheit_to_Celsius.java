import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float f;
        c=sc.nextInt();
        f=(5f/9)*(c-32);
        System.out.format("%.2f",f);
    }
}
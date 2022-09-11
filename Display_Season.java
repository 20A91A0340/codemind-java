import java.util.Scanner;
class Sample 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        ch=sc.nextInt();
        if(ch==4||ch==5||ch==6)
        System.out.println("Summer");
        else if(ch==7||ch==8||ch==9||ch==10)
        System.out.println("Rainy");
        else if(ch==11||ch==12||ch==1)
        System.out .println("Winter");
        else if(ch==2||ch==3)
        System.out.println("Spring");
        else
        System.out.println("-1");
        sc.close();
    }
}
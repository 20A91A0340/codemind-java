import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Integer inputNumber=scan.nextInt();
        checkUglyNumber(inputNumber);
    }
    public static void checkUglyNumber(Integer inputNumber)
    {
        int num=inputNumber;
        while(num!=1)
        {
            if(num%2==0)
              num/=2;
            else if(num%3==0)
              num/=3;
            else if(num%5==0)
              num/=5;
            else
            {
                System.out.println("Not Ugly Number");
                return;
            }
        }
        System.out.println("Ugly Number");
    }
}
            
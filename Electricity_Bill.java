import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String customer_id,customer_name;
        int units;
        float fee=1;
        customer_id=sc.nextLine();
        customer_name=sc.nextLine();
        units=sc.nextInt();
        if(units<=199)
        {
            fee=units*1.2f;
        }
        else if(units>=200 && units<400)
        {
            fee=units*1.5f;
        }
        else if(units>=400 && units<600)
        {
            fee=units*1.8f;
        }
        else
        {
            fee=units*2f;
        }
        if(fee>400)
        {
            fee=fee+fee*(0.15f);
        }
        else
        {
            fee=fee+100;
        }
        System.out.format("%.2f",fee);
    }
}
import java.util.Scanner;

public class odd_even 
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to check odd or even = : ");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("even number..");
        }
        else
        {
            System.out.println("odd number..");
        }
        sc.close();
    }
}

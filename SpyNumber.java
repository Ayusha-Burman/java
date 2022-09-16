import java.util.Scanner;
public class SpyNumber 
{
    
    static int sumDigit(int num)
    { 
        int r=0;
        int sum=0;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        return  sum;
    }
    static int mulDigit(int num)
    {
        int m=0;
        int mul=1;
        while (num > 0)
        {
            m = num % 10;
            mul = mul * m;
            num = num / 10;
        }
        return mul;
    }
    public static void main(String[] args)
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number=");
        num = sc.nextInt();
        int summation;
        int multiplication;
        summation=sumDigit(num);
        System.out.println(summation);
        multiplication=mulDigit(num);
        System.out.println(multiplication);
        if(summation==multiplication)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
    
}

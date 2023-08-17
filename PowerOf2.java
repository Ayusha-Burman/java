import java.util.*;
public class PowerOf2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        check(n);
    }
    public static void check(int n)
    {
        int isPower=n&(n-1);
        if(isPower==0)
        {
            System.out.println("It is a power of 2");
        }
        else
        {
            System.out.println("It is not a power of 2");

        }
    }
    
}

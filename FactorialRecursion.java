import java.util.Scanner;
public class FactorialRecursion {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      int res = factorial(n);
      System.out.println("Factorial is: "+res);
    }
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fact=n*factorial((n-1));
        return fact;
    }
    
}

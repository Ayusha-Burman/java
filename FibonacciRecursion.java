import java.util.*;
public class FibonacciRecursion {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(fibo(i) + " ");
        }
        
    }

    public static int fibo(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);   
    }
    
}

import java.util.*;
public class Recursion1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("In Decreasing Order:");
        decreasing(n);
    }
    public static void decreasing(int n)
    {
       
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        decreasing(n-1);
    }
    
}

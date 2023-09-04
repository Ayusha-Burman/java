import java.util.*;
public class Recursion2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i=1;
        System.out.println("In Increasing Order:");
        increasing(i,n);
    }
    public static void increasing(int i,int n)
    {
       if(i==n)
       {
        System.out.println(i);
        return;
       }
       System.out.print(i+" ");
        increasing(i+1,n);
    }
    
}

import java.util.*;
public class BitManipulation {
    public static void main(String[] args)
    {
        /*System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(5>>2);*/
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        oddEven(n);

        
    }
    public static void oddEven(int n)
    {
     if((n&1)==0)
     {
        System.out.println("Even");
     }
     else{
        System.out.println("Odd");
     }
    }
    
}

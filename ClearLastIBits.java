import java.util.*;
public class ClearLastIBits {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the number of bits to be cleared from last: ");
        int i=sc.nextInt();
        clearBitsFromLast(n,i);
    }
    private static  void clearBitsFromLast (int n,int i)
    {
        int bitmask=(~0)<<i;
        int number=n&bitmask;
        System.out.println("The number after clearing "+i+" bits from last is: "+number);
    }
    
}

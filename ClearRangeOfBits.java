import java.util.*;
public class ClearRangeOfBits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the starting position: ");
        int i=sc.nextInt();
        System.out.println("Enter the ending position: ");
        int j=sc.nextInt();
        clearRangeBits(n,i,j);
    }
    private static void clearRangeBits(int n, int i, int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        int number=n&bitMask;
        System.out.println("The number is: "+number);
    }
    
}

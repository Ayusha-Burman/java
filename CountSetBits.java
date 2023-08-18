import java.util.*;
public class CountSetBits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
       int result =  countSetBits(n);
       System.out.print("\nThe total set bits are "+result+"\n");
    }
    private static int countSetBits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1) != 0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    
}

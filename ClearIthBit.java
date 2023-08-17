import java.util.*;
public class ClearIthBit {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the position");
        int i=sc.nextInt();
        clearIthBit(n,i);
    }
    public static void clearIthBit(int n,int i)
    {
        int bitmask=~(1<<i);
        int number=n&bitmask;
        System.out.println("The number is: "+number);
    }
    
}

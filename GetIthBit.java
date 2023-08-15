import java.util.*;
public class GetIthBit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the position: ");
        int i=sc.nextInt();
        getIthBit(n,i);

    }
    public static void getIthBit(int n,int i)
    {
        int bitMask=1<<i;
        if((n&bitMask)==0)
        {
            System.out.println("It is: 0");
        }
        else
        {
            System.out.println("It is: 1");
        }
        
    }
    
}

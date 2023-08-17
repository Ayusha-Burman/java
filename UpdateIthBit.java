import java.util.Scanner;
public class UpdateIthBit {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the position: ");
        int i=sc.nextInt();
        System.out.println("Enter the value to be updated (either 0 or 1): ");
        int val=sc.nextInt();
        if(val==1)
        {
            setIthbit(n,i);
        }
        else if(val==0)
        {
            clearIthbit(n,i);
        }
        else
        {
            System.out.println("Not a valid number.");
        }
    }
    public static void setIthbit(int n,int i)
    {
        int bitmask=1<<i;
        int number = n|bitmask;
        if(i==1)
        {
            System.out.println("The number after setting "+i+"st bit is: "+number);
        }
        else if (i==2)
        {
            System.out.println("The number after setting "+i+"nd bit is: "+number);
        }
        else if(i==3)
        {
            System.out.println("The number after setting "+i+"rd bit is: "+number);
        }
        else
        {
            System.out.println("The number after setting "+i+"th bit is: "+number);
        }
    }
    public static void clearIthbit(int n,int i)
    {
        int bitmask=~(1<<i);
        int number=n&bitmask;
        System.out.println("The number is: "+number);
    }

    
}

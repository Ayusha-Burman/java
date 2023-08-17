import java.util.*;
public class SetIthBit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the position: ");
        int i=sc.nextInt();
        setIthBit(n,i);
    }
    public static  void setIthBit (int num, int i){
        int bitmask=1<<i;
        int number = num|bitmask;
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
}

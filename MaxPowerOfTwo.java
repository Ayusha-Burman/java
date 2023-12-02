import java.util.*;
public class MaxPowerOfTwo {
    public static void main(String args[])
    {
        int a=7;
        int b=12;
        int counter=0;
        int maxcounter=Integer.MIN_VALUE;
        int finalnum=0;
        int num=0;
        int p=0;
        for(int i=a;i<=b;i++)
        {
            num=i;
            p=i;
           while(p%2==0)
           {
            counter++;
            p=p/2;
           }
          if(maxcounter<counter)
          {
            maxcounter=counter;
            finalnum=num;
          }
          counter=0;
        }
        System.out.println("The number is "+finalnum);
        System.out.println("maxcounter "+maxcounter);

    }
    
}

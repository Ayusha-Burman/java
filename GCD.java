import java.util.*;
public class GCD {
    public static void main(String args[])
    {
        int num1=50;
        int num2=60;
        int res=1;
        int gcd=1;
        for(int i=1;i<num1 && i<num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
               res=i;
            }
            if(gcd<res)
            {
                gcd=res;   
            }
        }
        System.out.println(gcd);
    }
    
}

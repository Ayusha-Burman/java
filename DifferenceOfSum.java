import java.util.*;
public class DifferenceOfSum {
    public static void main(String[] args)
    {
        int n=3;
        int m=10;
        int result=differenceofsum(n,m);
        System.out.println(result);
       
    }
    public static int differenceofsum(int n,int m)
    {
        int divisible=0;
        int notdivisible=0;
        int diff=0;
        for(int i=1;i<=m;i++)
        {
            if(i%n==0)
            {
               divisible = divisible+i;
            }
            else
            {
              notdivisible=notdivisible+i;
            }
        }
        diff=notdivisible-divisible;
        return diff;
    }
}

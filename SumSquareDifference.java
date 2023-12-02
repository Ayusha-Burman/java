import java.util.*;
public class SumSquareDifference {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int digitsum=0;
        int totalsum=0;
        int totalsum2=0;
        for(int i=1;i<=t;i++)
        {
          int n=sc.nextInt();
          for(int j=1;j<=n;j++)
          {
            digitsum=digitsum+((int)Math.pow(j,2));
            totalsum=totalsum+j;
          }
          //System.out.println(digitsum);
          //System.out.println(totalsum2);
          totalsum2=totalsum*totalsum;
          int diff=totalsum2-digitsum;
          System.out.println(diff);
          digitsum=0;
          totalsum=0;
          totalsum2=0;
        }
    }
    
}

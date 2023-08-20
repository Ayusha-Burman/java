import java.util.*;
public class FastExpoentiation {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the number: ");
            int a=sc.nextInt();
            System.out.println("Enter the power: ");
            int n=sc.nextInt();
            int result =  fastExpo(a,n);
            System.out.print("\nThe value is "+result+"\n");
        }
        private static int fastExpo(int a, int n)
        {
            int ans=1;
            while(n>0)
            {
                if((n&1) != 0)
                {
                    ans=ans*a;
                }
                a=a*a;
                n=n>>1;
            }
            return ans;
        }
        
}
    
    


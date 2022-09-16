import java.util.Scanner;
import java.lang.Math;
public class series1 {
    public static void main(String[]argh){
        Scanner in = new Scanner(System.in);
        int sum =0;
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println("\n");
            for(int j=0;j<n;j++)
            {
                //sum=(int)Math.pow(2 , j);
                if (j==0)
                {
                    sum = sum + a + (b*((int)Math.pow(2 , j)));
                    System.out.print(sum+" "); 
                }
                else{
                    sum = sum +  (b*((int)Math.pow(2 , j)));
                    System.out.print(sum+" ");
                }    
               
              
            }
            sum=0;
            System.out.println("\n");
        }
        in.close();
    }
    
}

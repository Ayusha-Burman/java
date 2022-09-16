import java.util.*;

import java.lang.Math;


public class ayu{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        int sum =0;
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
               
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
            System.out.println("");
        }
        in.close();
    }
}

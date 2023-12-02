import java.util.*;
public class ProductSmallestPair {
    public static void main(String[] args)
    {
        int sum=4;
        int size=6;
        int[] arr={9, 8, 3, -7, 3, 9};
        int result=product(sum,arr);
        System.out.println(result);

    }
    public static int product(int sum,int[] arr)
    {
        int min=Integer.MAX_VALUE;
        int check=0;
        int finalj=0;
        int finalk=0;
        for(int j=0;j<arr.length;j++)
        {
            for(int k=j+1;k<arr.length;k++)
            {
                check=arr[j]+arr[k];
                if(check<min && check<sum)
                {
                    min=check;
                    finalj=j;
                    finalk=k;
                }
            }
        }
        return (arr[finalj]*arr[finalk]);
    }
    
}

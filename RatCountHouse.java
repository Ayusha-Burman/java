import java.util.*;
public class RatCountHouse {
    public static void main(String args[])
    {
        int r=7;
        int unit=2;
        int n=8;
        int sum=0;
        int[] arr={2, 8, 3, 5, 7, 4, 1, 2};
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(sum==(r*unit)||sum>(r*unit))
            {
                System.out.println("The number of houses is "+(i+1));
                break;
            }
        }
        if(sum<(r*unit))
        {
            System.out.println(-1);
        }
    }
    
}

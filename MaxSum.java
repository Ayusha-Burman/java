import java.util.*;
public class MaxSum {
    public static void main(String args[])
    {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum sum of subarray is "+maxSubArraySum(arr));
    }
    public static int maxSubArraySum(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(maxSum<sum)
            {
                maxSum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;
    }
    
}

import java.util.*;
public class LargeSmallSum {
    public static void main(String args[])
    {
        int[] arr={1, 8, 0, 2, 3, 5, 6};
        int result=largesmallSum(arr);
        System.out.println(result);
    }
    public static int largesmallSum(int[] arr)
    {
        int sum=0;
       if(arr.length<=0 || arr.length<=3)
       {
        return 0;
       }
       int[] evenposition=new int[(arr.length+1)/2];
       int[] oddposition=new int[arr.length/2];
       for(int i=0;i<arr.length;i++)
       {
        if(i%2==0)
        {
            evenposition[i/2]=arr[i];
        }
        else
        {
            oddposition[i/2]=arr[i];
        }

       }
       Arrays.sort(evenposition);
       Arrays.sort(oddposition);
       sum=evenposition[evenposition.length-2]+oddposition[1];
       return sum;
    }
    
}

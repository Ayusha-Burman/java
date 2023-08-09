import java.util.*;
public class MaxSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" items:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] subarray=new int[n];
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++)
        { 
            int k=0;
            for(int j=i;j<n;j++)
            {
                currSum=0;
              subarray[k]=arr[j];
              for(int l=0;l<=k;l++)
              {
                currSum=currSum+subarray[l];
              }
              k++;
              if(maxSum<currSum)
              {
                maxSum=currSum;
              }

            }
        }
        System.out.println("Maximum sum = "+maxSum);
    }
    
}

import java.util.*;
public class SubArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" items:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing subarrays:");
        int[] subarray=new int[n];
        for(int i=0;i<n;i++)
        { 
            int k=0;
            for(int j=i;j<n;j++)
            {
              subarray[k]=arr[j];
              System.out.print("[");
              for(int l=0;l<=k;l++)
              {
                System.out.print(" "+subarray[l]+" ");
               
              }
              System.out.print("] ");
              k++;
            }
            System.out.println();
        }
    }
    
}

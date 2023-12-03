import java.util.*;
public class PeakElement {
    public static void main(String args[])
    {
       int[] arr={1, 3, 20, 4, 1, 0};
       int res=findPeak(arr);
       System.out.println("Peak element: "+res);
    }
    public static int findPeak(int[] arr)
    {
        int i=0;
       if(arr[0]>arr[1])
       {
        System.out.println("Index: "+(i+1));
        return arr[0];
       }
       else if(arr[arr.length-1]>arr[arr.length-2])
       {
        System.out.println("Index: "+(i+1));
        return arr[arr.length-1];
       }
       else
       {
        for(i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            { 
                System.out.println("Index: "+(i+1));
                return arr[i];
            }
        }
       }
       return -1;
    }
    
}

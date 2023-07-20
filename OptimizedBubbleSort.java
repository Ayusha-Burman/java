import java.util.*;
public class OptimizedBubbleSort {
    public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int i=0,j=0;
        int temp=0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int[] arr=new int[n];
        int swap=0;
        System.out.println("Enter "+n+" elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(i=0;i<arr.length;i++)
        {  
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap++;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(swap==0)
        {
            System.out.println("THE ARRAY WAS SORTED");
            break;
        }
        }
        
        
            System.out.println("THE SORTED ARRAY IS: ");
            for(i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        
        
    
    }
}
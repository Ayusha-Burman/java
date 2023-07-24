import java.util.*;
public class CountingSort {
    public static void main(String args[])
    {
     Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        countingSort(arr,n); //calling function to sort using selection sort algorithm
        printarray(arr);
    }
                                                          
    public static void countingSort(int[] arr,int n)
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            largest=Math.max(largest, arr[i]);  
        }
        int count[]=new int[largest+1];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
        public static void printarray(int[] arr)
        {
            System.out.println("The sorted array is: ");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

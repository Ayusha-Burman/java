import java.util.*;
public class InsertionSort {
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
        insertionsort(arr,n); //calling function to sort using selection sort algorithm
        printarray(arr);
    }                                                      
    public static void insertionsort(int[] arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
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




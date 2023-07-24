import java.util.*;
public class SelectionSort {
    public static void main(String args[])
    {
     Scanner sc= new Scanner(System.in);
       int n=0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of the array");//arr=[5,4,1,3,2]
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        selectionsort(arr,n); //calling function to sort using selection sort algorithm

    }                                                      
    public static void selectionsort(int[] arr,int n)//arr=[1,4,5,3,2]
    {
        int temp=0;
        for(int i=0;i<n-1;i++)//0     //n-1=4
        {
            int minpos=i;//0
            for(int j=i+1;j<n;j++)//4   n=5
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;//minpos=2
                }
            }
            temp=arr[minpos];//temp=1
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        System.out.println("THE SORTED ARRAY IS: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" items:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Binary Search
        int si=0;
        int ei=n-1;
       System.out.println("Enter the item to be searched: ");
       int key=sc.nextInt();
       while(si<=ei)
       {
        int mid= (si+ei)/2;
        if(arr[mid]==key)
        {
            System.out.println("Element found at position: "+(mid+1));
            break;
        }
        else if(key>arr[mid])//right
        {
            si=mid+1;
        }
        else
        {
            ei=mid-1;//left
        }
     
        }
    }   
}

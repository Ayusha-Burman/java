import java.util.*;
public class ReverseArray1 {
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
        int si=0;
        int ei=n-1;
        int temp=0;
        while (si<=ei)
        { 
            temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}

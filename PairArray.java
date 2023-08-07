import java.util.*;
public class PairArray {
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
        System.out.println("Printing pairs:");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.print(" ("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        } 
    }
}

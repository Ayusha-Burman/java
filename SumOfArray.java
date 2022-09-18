import java.util.Scanner;

import javax.print.event.PrintEvent;
public class SumOfArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int sum = 0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("THE SUM OF THE ARRAY IS: ");
        for(int j=0;j<arr.length;j++)
        {
             sum=sum+arr[j];
        }
        System.out.print(sum);
        sc.close();
    }
}

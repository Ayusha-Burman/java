import java.util.Scanner;
public class SumOfTwoArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] sum=new int[n];
        System.out.println("Enter "+n+" elements of the array1");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter "+n+" elements of the array2");
        for(int j=0;j<arr2.length;j++)
        {
            arr2[j]=sc.nextInt();
        }
        System.out.println("Array 1: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
        System.out.println("Array 2: ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("");
        System.out.println("SUM OF TWO ARRAYS: ");
        for(int k=0;k<arr2.length;k++)
        {
            sum[k]=arr1[k]+arr2[k];
            System.out.print(sum[k]+" ");
        }
     sc.close();

    }

}

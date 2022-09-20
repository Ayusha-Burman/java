import java.util.Scanner;
public class MergeTwoArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] c=new int[n];
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
        int a1=arr1.length;
        int a2=arr2.length;
        merge(a1,a2,arr1,arr2);
     }
     public static void merge(int a1, int a2, int[] arr1, int[] arr2)
     {
        System.out.println("MERGED ARRAY: ");
        int c1 = a1 + a2;
        int[] c = new int[c1];
        for (int i = 0; i < a1; i = i + 1)
         {
            c[i] = arr1[i];
        }
        for (int i = 0; i < a2; i = i + 1)
         {
  
            c[a1 + i] = arr2[i];
        }
        for (int i = 0; i < c1; i = i + 1) 
        {
            System.out.print(c[i]+" ");
        }
 } 
}
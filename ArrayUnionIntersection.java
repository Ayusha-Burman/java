import java.util.Scanner;
public class ArrayUnionIntersection {
    public static void main(String []aStrings)
    {
        int m,n;
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the 1st array: ");
        m=sc.nextInt();
        int[] arr1= new int[m];
        System.out.println("Enter the size of the 2nd array: ");
        n=sc.nextInt();
        int[] arr2=new int[n];
        System.out.println("Enter "+m+" elements of array 1"); 
        for(i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter "+n+" elements of array 2"); 
        for(i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        i=0;
        System.out.println("UNION:");
       while(i<m && j<n)
       {
        if(arr1[i]<arr2[j])
        {
            System.out.print(arr1[i]+" ");
            i++;
        }
        else if (arr1[i]>arr2[j])
        {
            System.out.print(arr2[j]+" ");
            j++;
        }
        else{
            System.out.print(arr2[j]+" ");
            i++;
            j++; 
        }
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");
        
       }
       i=0;
       j=0;
       System.out.println();
       System.out.println("INTERSECTION:");
       while(i<m && j<n)
       {
        if(arr1[i]==arr2[j])
        {
            System.out.print(arr1[i]+" ");
            i++;
            j++;
        }
        else if(arr1[i]<arr2[j])
        {
            i++;
        }
        else{
            j++;
        }
       }
    }
}

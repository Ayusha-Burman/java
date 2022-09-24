import java.util.Scanner;
public class KthLargest {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        DescendingSort(arr);
    }
        public static void DescendingSort(int[] arr)
        {
            int i;
            int j;
            int temp;
            int k;
            Scanner sc=new Scanner(System.in);
            for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Enter  the value of K: ");
         k=sc.nextInt();
         System.out.println(arr[k-1]+" is the "+k+" largest element");

        }
    }


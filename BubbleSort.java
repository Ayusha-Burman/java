import java.util.Scanner;
public class BubbleSort
 {
    public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int i=0,j=0;
        int temp=0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of the array");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("THE SORTED ARRAY IS: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }    
}

import java.util.Scanner;
public class Duplicate {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int i , j;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of the array"); 
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("DUPLICATE ELEMENTS ARE: ");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}

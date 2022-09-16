import java.util.Scanner;
public class Smallest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of the array");
        for(int i=0;i<arr.length;i++)
        {

            arr[i]=sc.nextInt();
        }
        System.out.print("THE SMALLEST ELEMENT IN THE ARRAY IS: "+getSmallest(arr,n));
    }
    public static int getSmallest(int[] arr, int n)
    {
        int temp=0;
        int i,j;
        
        for (i=0;i<arr.length;i++)
        {
            for (j=i+1;j<arr.length;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;

              }
              
            }
        }
        
        return arr[0];
    }
        
        
 }
    


    


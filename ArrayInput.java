import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        
        int n;
        int i;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of the array");
        for(i=0;i<arr.length;i++)
        {

            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("The elements of the array entered are: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       

    }
}

import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n=sc.nextInt();
        int[] arr=new int[8];
        System.out.println();
        int rem=0;
        int i=0;
        while (n>0)
        {
            arr[i]=n%2;
            n=n/2;
            i++;
            
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
    }
    
}

import java.util.*;
public class DiagonalSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //calculating diagonal sum using nested loops and adding them up
        int sum=0;
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("\nThe Sum of Diagonals is "+sum+"\n");
    }
}

import java.util.Scanner;
public class CreatingArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows of the array: ");
        int n =sc.nextInt();
        System.out.println("Enter the no. of rows of the array: ");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        //creating the array
        System.out.println("Enter "+(n*m)+" elements for the Matrix");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        //printing matrix using nested loops
        System.out.println("Matrix:");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

import java.util.*;
public class Transpose {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter "+(n*m)+" items: ");
        for (int i=0;i<n;i++)
        {
           for(int j=0;j<m;j++)
           {
            arr[i][j]=sc.nextInt();
           }
        }
        System.out.println("Original Matrix: ");
        for (int i=0;i<n;i++)
        {
           for(int j=0;j<m;j++)
           {
            System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
        transpose(n,m,arr);

    
    }
    public static void transpose(int n,int m,int[][] arr)
    {
        int trans[][]= new int[100][100];
        for (int i=0;i<n;i++)
        {
           for(int j=0;j<m;j++)
           {
            trans[j][i]=arr[i][j];
           }
        }
    
       //Printing transposed matrix
       System.out.println("Transpose Matrix: ");
        for (int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
            System.out.print(trans[i][j]+" ");
           }
           System.out.println();
        }
    }
}

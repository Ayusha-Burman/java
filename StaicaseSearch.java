import java.util.*;
public class StaicaseSearch {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of the  array");
        n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[100][100];
        System.out.println("Enter "+(n*n)+" elements of the array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
           
        }
        printarray(arr,n,m);
        starircaseSearch(arr,n,m); 
    }
    public static void printarray(int[][] arr,int n,int m)
    {
        System.out.println("Array:");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void starircaseSearch(int[][] arr,int n,int m) throws ArrayIndexOutOfBoundsException
    {
        Scanner sc=new Scanner(System.in);
       //int topRight=arr[0][m-1];
       int bottomLeft=arr[n-1][0];
       int key=0;
       int flag=0;
       int i=0;
       int j=m-1;
       System.out.println("Enter the value to be searched: ");
       key=sc.nextInt();
       if (key ==bottomLeft )
       {
        System.out.println(key+" found at ("+(n-1)+",0)");
       }
       else
       {
        while (i >= 0 && i < n && j >= 0 && j < m) {
            int currentValue = arr[i][j];

            if (key == currentValue) {
                System.out.println("Found at (" + i + "," + j + ")");
                return; 
                // Exit the method since the key is found.
            } 
            else if (key < currentValue) {
                // Move left in the same row.
                j--;
            }
             else {
                // Move down to the next row.
                i++;
            }
        }
        }
        
        
       }
    }


import java.util.Scanner;
public class RowSorting {
    private static int[][] arr;//instance variable
    public static int n;//instance variable
    public RowSorting(int n)//constructor
    {
        this.n=n;
        arr = new int[n][n];
    }
        public static void input()
        {
            Scanner sc=new Scanner(System.in);
            int i=0,j=0;
            System.out.println("Enter "+(n*n)+" elements of the array");
            for(i=0;i<arr.length;i++)
            {
                for(j=0;j<arr.length;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
                
            }
            System.out.println("THE UNSORTED ARRAY IS: ");
        }
        
        public static void sort()
        {
            int i,j,k;
            int temp=0;
            for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if(arr[i][j]>arr[i][k])
                    {
                        temp=arr[i][j];
                        arr[i][j]=arr[i][k];
                        arr[i][k]=temp;
                    }
                }
            }
            
        }
        System.out.println("THE SORTED ARRAY IS: ");
        }
        public static void display()
        {
            int i,j;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
            
        }
        

    }    


   

import java.util.Scanner;
public class ArrayFind {
    private static int[] arr;//instance variable
    public static int n;//instance variable
    public ArrayFind(int n)
    {
        this.n=n;
        arr = new int[n];
    }

public static void input()
        {
            Scanner sc=new Scanner(System.in);
            int i=0;
            System.out.println("Enter "+n+" elements of the array");
            for(i=0;i<arr.length;i++)
            {
                
                    arr[i]=sc.nextInt();
                
                
            }
            
        }
        
        public static void find()
        {
            int flag=0;
            Scanner sc=new Scanner(System.in);
            int k;
            System.out.println("Enter the value to be searched: ");
            k=sc.nextInt();
            for(int i=0;i<n;i++)
            {    
                if(arr[i] == k)
                {   
                    flag = 1; 
                   
        }
        else
        {
            flag=0;
            
        }
    }
    if(flag==1)
    {
        System.out.println("Found");
    }
    else
        {
            System.out.println("Not Found");
        }
}
}

      


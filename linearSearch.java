import java.util.Scanner;
public class linearSearch {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int size;
    int i=0,c=0;
    int temp=0;
    int flag=0;
    System.out.println("Enter the size of the array: ");
    size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter "+ size +" elements");
    for (i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element to searched");
    c=sc.nextInt();
   for(i=0;i<size;i++)
   {

    if(c==arr[i])
    {
         flag = 1;
        

    }
     else{
         flag=1;
        
     }
   }
   if (flag==1)
   {
    System.out.println("Element found" );
   }
   else{
    System.out.println("Element not found");
   }
}
    
}

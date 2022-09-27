import java.util.Scanner;
public class SubarraySum {
    private static int[] arr;//instance variable
    public static int n;//instance variable
    public  SubarraySum(int n)
    {
        this.n=n;
        arr=new int[n];
    }
    public static void input()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter "+n+" elements of the array");
            for(int i=0;i<n;i++)
            {
                
                    arr[i]=sc.nextInt();
                
                
            }
            
        }
        public static void calc()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of sum: ");
            int sum;
            sum=sc.nextInt();
            for (int i = 0; i < n; i++) {
                int currentSum = arr[i];
     
                if (currentSum == sum) {
                    System.out.println("Sum found at index " + i);
                    return;
                }
                else {
                    for (int j = i + 1; j < n; j++) {
                        currentSum += arr[j];
     
                        if (currentSum == sum) {
                            System.out.println(
                                "Sum found between indexes " + i
                                + " and " + j);
                            return;
                        }
                    }
                }
            }
            System.out.println("No subarray found");
            return;
        }
}

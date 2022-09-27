import java.util.Scanner;
public class TestSubarraySum {
    public static void main(String[] args)
    { int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the  array");
            n=sc.nextInt(); 
            SubarraySum obj1=new SubarraySum(n);
            obj1.input();
            obj1.calc();
}
}

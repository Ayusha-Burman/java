import java.util.Scanner;
public class BuzzNumber {
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        if(num%10==7 || num%7==0)
        {
            System.out.println(num+" is a Buzz number");
        }
        else{
            System.out.println(num+" is not a Buzz Number");
        }
        sc.close();
    }

    
}

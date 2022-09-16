import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int temp,n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
          r=n%10;
          sum=(sum*10)+r;
          n=n/10;
        }
        if(sum==temp)
        {
            System.out.println(temp+ " is a palindrome");
        }
        else{
            System.out.println(temp+ "is not a palindrome");
        }
        sc.close();  
    }
  
}

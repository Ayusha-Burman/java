import java.util.Scanner;
public class TestArrayFind {
    public static void main(String[] args)
    { int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the  array");
            n=sc.nextInt();
            ArrayFind obj1=new ArrayFind(n);
        
        obj1.input();
       
        obj1.find();
        
    }
    
}

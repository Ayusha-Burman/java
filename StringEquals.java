import java.util.*;
public class StringEquals {
    public static void main(String[] args)
    {
        String s1="Ayusha";
        String s2="Ayusha";
        String s3=new String("Ayusha");
        String s4=new String("AyushA");
        if(s1==s2)
        {
            System.out.println("s1 and s2 are equal");
        }
        else
        {
            System.out.println("s1 and s2 are not same");
        }
        if(s1==s3)
        {
            System.out.println("s1 and s3 are equal");
        }
        else
        {
            System.out.println("s1 and s3 are not same");
        }
        if(s1.equals(s3))
        {
            System.out.println("s1 and s3 are equal in .equals()");
        }
        else{
            System.out.println("s1 and s3 are not same in .equals()");
        }
        if(s1.equalsIgnoreCase(s4))
        {
            System.out.println("s1 and s4 are equal in .equalsIgnoreCase()()");
        }
        else{
            System.out.println("s1 and s4 are not same in .equalsIgnoreCase()");
        }
    }
    
}

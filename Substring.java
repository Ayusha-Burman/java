import java.util.*;
public class Substring {
    public static void main(String[] args)
    {
        String str="HelloWorld";
        int si=0;
        int ei=6;
        String substr="";
        for(int i=si;i<ei;i++)
        {
           substr=substr+str.charAt(i);
        }
        System.out.println("Substring is "+substr);
        System.out.println("Substring from library function is "+str.substring(0, 5));
    }
    
}

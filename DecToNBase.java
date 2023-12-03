import java.util.*;
public class DecToNBase {
    public static void main(String args[])
    {
        int n=21;
        int num=5678;
        int rem=0;
        char digit='a';
        String res="";
        while(num!=0)
        {
          rem=num%n;
          if(rem<10)
          {
            digit=(char)('0'+rem);
          }
          else 
          {
            digit=(char)('A'+(rem-10));
          }
          res=digit+res;
          num=num/n;
        }
        System.out.println(res);
    }
    
}

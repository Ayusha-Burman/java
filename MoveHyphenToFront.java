import java.util.*;
public class MoveHyphenToFront {
    public static void main(String[] args)
    {
        String str="Move-Hyphens-to-Front";
        int counter=0;
        String finalstr="";
        for (int i = 0; i <str.length(); i++)
        {
            if(str.charAt(i)=='-')
            {
                counter++;
                finalstr=finalstr+str.charAt(i+1);
                i++;

            }
            else
            {
                finalstr=finalstr+str.charAt(i);
            }
        }
        for(int i=counter;i>0;i--)
        {
            finalstr='-'+finalstr;
        }
        System.out.println(finalstr);
    }
    
}

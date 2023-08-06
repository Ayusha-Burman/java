import java.util.*;
public class StringUpperCase {
    public static void main(String[] args)
    {
        String str="hi i am ayusha burman";
        StringBuilder sb = new StringBuilder("");
        System.out.println("original string is \n"+str);
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(ch);
                ch=str.charAt(i+1);
                ch=Character.toUpperCase(ch);
                sb.append(ch);
                i++;
            }
            else{
                sb.append(ch);

            }
        }
        System.out.println(sb);
    }
    
}

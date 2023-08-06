import java.util.*;
public class StringCompression {
    public static void main(String[] args)
    {
        String str="AAABBBCCCDDD";
        
        StringBuilder sb = new StringBuilder("");
        System.out.println("Original string is "+str);
        char ch='a';
        int count=1;
        for(int i=0;i<str.length()-1;i++)
        {
            ch=str.charAt(i);
            if(str.charAt(i+1)==ch && i==str.length()-2)
            {
                count++;
                sb.append(ch).append(count);
            }
            else if(str.charAt(i+1)==ch)
            {
                count++;
            }
            
            else
            {
                if(count>1)
                {
                    sb.append(ch).append(count);
                 //sb.append(count);
                }
                else
                {
                    sb.append(ch);
                }
                count=1;
            }
            if(i==str.length()-2 && str.charAt(i+1)!=ch)
            {
                sb.append(str.charAt(i+1));
            }
            
        }
        
        System.out.println("\nCompressed string is: "+sb);
        
    }
    
}

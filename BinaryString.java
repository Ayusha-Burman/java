import java.util.*;
public class BinaryString {
    public static void main(String[] args)
    {
        String str="0C1A1B1C1C1B0A0";
        int n=str.length();
        char operation='a';
        int digit=0;
        int result=Character.getNumericValue(str.charAt(0));
        for (int i = 1; i <n ; i=i+2) 
        {
            operation=str.charAt(i);
            digit=Character.getNumericValue(str.charAt(i+1));
            if(operation=='A')
            {
                result=result&digit;
            }
            if(operation=='B')
            {
                result=result|digit;
            }
            if(operation=='C')
            {
                result=result^digit;
            }

        }
        System.out.println(result);
    }
}

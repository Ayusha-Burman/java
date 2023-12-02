import java.util.*;
public class WorldHello {
    public static void main(String args[])
    {
        String str="Hi Ayusha I am Shaswata";
        String[] strArr=str.split(" ");
        String finalStr="";
        for(int i=strArr.length-1;i>=0;i--)
        {
            finalStr=finalStr+strArr[i]+" ";
        }
        System.out.println(finalStr.trim());
    }
    
    
}

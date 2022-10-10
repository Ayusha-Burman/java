import java.util.Scanner;
public class MaxOccuringCharacter {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        System.out.println("Enter the string:");
        str=sc.nextLine();
        int len=str.length();
        char string[] = str.toCharArray();  
        char maxchar='a';
        int i , j , c=0,cnt=0;
        for (i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0')
                {
                    c++;
                    if(c>cnt)
                    {
                        maxchar=string[j];
                        cnt=c;
                    }

                }
            }
        }
        c=0;
        for (i=0;i<len;i++)
        {
            if(str.charAt(i)==maxchar)
            {
                c++;
            }
        }

        System.out.println("The maximum occuring character is: "+maxchar+" which occurs "+c+" times in the word "+str);
    }
}

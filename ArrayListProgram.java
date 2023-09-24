import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProgram {
    public static void main(String args[])
    {
        //DECLARATION
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Boolean> list2=new ArrayList<>();

        //ADD
      /*  list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(1,9);
        System.out.println(list);

        //GET
        int element=list.get(2);
        System.out.println(element);

        //DELETE
        list.remove(2);
        System.out.println(list);

        //SET
        list.set(1,10);
        System.out.println(list);

        //CONTAINS
        System.out.println(list.contains(1));
        System.out.println(list.contains(21));

        //SIZE OF ARRAY LIST
        System.out.println(list.size());
        
        //PRINT ARRAY LIST REVERSE
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //FIND MAX ELEMENT
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            int val=list.get(i);
            if(val>=max)
            {
                max=val;
            }
        }
        System.out.println("Max element = "+max);


        //SWAP
        System.out.println("Original list: "+list);

        //int temp=0;
        int temp=list.get(2);
        list.set(2,list.get(4));
        list.set(4,temp);
        System.out.println("Modified list: "+list);*/ 

        //COLLECTIONS
        //SORT
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);
        System.out.println(list1);

        //ascending order
        Collections.sort(list1);
        System.out.println(list1);

        //descending order
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
        

    }
    
}

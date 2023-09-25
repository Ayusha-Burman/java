import java.util.*;
public class MultiDimensionalArrayList {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);


        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(mainList);





    }
    
}

package dataStructure.list.linkList.listIt;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        var staff = new LinkedList<String>();
        staff.add("amy");
        staff.add("bob");
        staff.add("cat");
        System.out.println(staff);
        ListIterator<String> iter = staff.listIterator();
        iter.add("First");
        String first = iter.next();
        String secend = iter.next();
        iter.remove();
        System.out.println(first + " " + secend);
        System.out.println(staff);
        iter.add("wuhu");
        System.out.println(staff);
        iter.add("qifei");
        System.out.println(staff);
        iter.add("ww");
        System.out.println(iter.hasNext());
        //iter.next();
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        iter.remove();
        System.out.println(staff);
        ListIterator<String> iter1 = staff.listIterator();
        //for(int i=0;i<staff.size();i++)  System.out.println(iter1.next());
        //效果等同System.out.println(iter1.get(i));但是链表.get(i)很麻烦，效率低


    }

}

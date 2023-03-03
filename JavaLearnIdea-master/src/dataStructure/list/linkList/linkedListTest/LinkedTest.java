package dataStructure.list.linkList.linkedListTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedTest {
    public static void main(String[]args){
        var a=new LinkedList<String>();
        var b=new LinkedList<String>();
        a.add("aini");
        a.add("bob");
        a.add("cono");
        b.add("Amy");
        b.add("Bibi");
        b.add("Com");
        b.add("Dog");
        System.out.println(a);
        System.out.println(b);
        ListIterator<String > aIter=a.listIterator();
        Iterator<String> bIter=b.iterator();
        while(bIter.hasNext()){//不为空执行，把b中都放入a后为空跳出
            if(aIter.hasNext()) aIter.next();//a迭代器后面还有元素就隔一个添加一个
            aIter.add(bIter.next());//把B迭代器引用的元素放大A迭代器引用的位置的
        }
        System.out.println(a);
        System.out.println(b);
        bIter=b.iterator();
        while(bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);
        a.removeAll(b);
        System.out.println(a);

    }
}

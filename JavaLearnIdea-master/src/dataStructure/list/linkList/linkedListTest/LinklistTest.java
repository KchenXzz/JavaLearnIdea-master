package dataStructure.list.linkList.linkedListTest;

import horstmann.corejava.Employee;
import horstmann.corejava.Manager;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistTest {
    public static void main(String[]args){
          /*
        对Java内部的链表实现（Linkedlist类）进行测试
         */
        var stafflist=new LinkedList<Employee>();
        var ceolist=new LinkedList<Manager>();
        var l1 = new Employee("wuhu1", 3000, 2022, 12, 7);
        var l2 = new Employee("wuhu2", 3000, 2022, 12, 7);
        var l3 = new Employee("wuhu3", 3000, 2022, 12, 7);
        var l4 = new Employee("wuhu4", 3000, 2022, 12, 7);
        var l5 = new Employee("wuhu5", 3000, 2022, 12, 7);
        stafflist.add(l1);
        stafflist.add(l2);
        stafflist.add(l3);
        stafflist.add(l4);
        stafflist.add(l5);
        var c1 = new Manager("mayun", 30000, 2000, 2, 2);
        var c2 = new Manager("huateng");
        var c3 = new Manager("ceo", 40000);
        ceolist.add(c1);
        ceolist.add(c2);
        ceolist.add(c3);

        for (Employee e:stafflist)  System.out.println(e);
        System.out.println("size is "+stafflist.size());
        System.out.println(stafflist.getFirst());
        stafflist.set(0,l5);
        System.out.println(stafflist.getFirst());
        System.out.println("--------------------------");
        System.out.println("size is "+stafflist.size());
        stafflist.removeFirst();
        System.out.println("size is "+stafflist.size());
        for (Employee e:stafflist)  System.out.println(e);
        System.out.println("is contains l1? "+stafflist.contains(l1));
        stafflist.remove(l5);
        System.out.println("size is "+stafflist.size());
        stafflist.addAll(ceolist);
        for (Employee e:stafflist)  System.out.println(e);
        System.out.println("size is "+stafflist.size());
        System.out.println("--------------------------");
        ListIterator<Employee> p= stafflist.listIterator();
        System.out.println(p);
        Object[] e= stafflist.toArray();
        for(Object x:e) System.out.println(x);


    }
}

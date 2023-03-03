package dataStructure.list.linkList.singlistTest;

import horstmann.corejava.Employee;
import dataStructure.list.linkList.MyLinkedList;

import java.util.ListIterator;

public class SinglistTst {
    public static void main (String []args){
        var ls1=new MyLinkedList<Employee>();
        var staff1=new Employee("staff1",2000,2020,01,01);
        var staff2=new Employee("staff2",2000,2020,01,01);
        var staff3=new Employee("staff3",2000,2020,01,01);
        var staff4=new Employee("staff4",2000,2020,01,01);
        var staff5=new Employee("staff5",2000,2020,01,01);
        ls1.add(staff1);
        ls1.add(staff2);
        ls1.add(staff3);
        ls1.add(staff4);
        ls1.add(staff5);
        for(int i=0;i<5;i++) System.out.println(ls1.get(i));//存储元素是从下标0开始的


        ListIterator<Employee> p=ls1.listIterator();
        System.out.println(p.hasNext());
        System.out.println(p.hasPrevious());



        //for(int i=0;i<ls1.size();i++) System.out.println(p.next());//存储元素是从下标0开始的
        p.add(staff5);
        //System.out.println(ls1);


    }
}

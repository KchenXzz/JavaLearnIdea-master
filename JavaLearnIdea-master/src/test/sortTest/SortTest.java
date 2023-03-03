package test.sortTest;

import horstmann.corejava.Employee;

import java.util.Arrays;
import java.util.Comparator;
public class SortTest {
    public static void main(String[] args){
        var staff=new Employee[4];
        staff[0]=new Employee("Tom",5000);
        staff[1]=new Employee("Jerry",4000);
        staff[2]=new Employee("dog",2000);
        staff[3]=new Employee("Yuimi",3000);
        Arrays.sort(staff, Comparator.comparing((Employee::getName)));
        for(Employee x:staff)
            System.out.println(x);
        System.out.println(staff[0]);
    }

}
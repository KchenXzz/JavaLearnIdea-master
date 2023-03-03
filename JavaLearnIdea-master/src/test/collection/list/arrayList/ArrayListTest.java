package test.collection.list.arrayList;

import horstmann.corejava.Employee;

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args){
        var staff=new ArrayList<Employee>();
        staff.add(new Employee("汤姆",5000,2022,11,2));
        staff.add(new Employee("杰瑞",4000));
        staff.add(new Employee("看门狗",3000));
        for(Employee e:staff){
            System.out.println(e);
        }
        System.out.println("staff.size="+staff.size());
        System.out.println();
        Employee a=new Employee("哮天犬");
        Employee n=new Employee("二郎神");
        staff.add(2,a);
        staff.set(1,n);
        for(Employee b:staff){
            System.out.println(b);
        }
        System.out.println("staff.size="+staff.size());

    }
}

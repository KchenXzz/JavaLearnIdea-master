package test.collection.set.hashset;

import horstmann.corejava.Employee;

import java.util.ArrayList;

/**
 * @projectName: JavaLearnIdea
 * @package: test.collection.set.hashset
 * @className: HashSetTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-10 上午 9:52
 * @version: 1.0
 */
public class HashSetTest {

    public static void main(String[] args) {


        Employee  emp1 = new Employee("张三", 2000);
        Employee  emp2 = new Employee("张三", 2000);
        Employee  emp3 = new Employee("张三", 2000);
        Employee  emp4 = new Employee("张三", 2500);
        Employee  emp5 = new Employee("李四", 2000);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

//        for (Employee employee : list) {
//            System.out.println(employee.hashCode()); //属性一样，哈希值一样
//        }

        //哈希冲突
        System.out.println("bc".hashCode());//3137
        System.out.println("cD".hashCode());//3137





    }












}

package test.collection.set.treeSet;

import horstmann.corejava.Employee;

import java.util.TreeSet;

/**
 * @projectName: JavaLearnIdea
 * @package: test.collection.set.hashset
 * @className: HashSetTest2
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-10 上午 10:00
 * @version: 1.0
 */
public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<Employee> treeSet = new TreeSet<>();

        Employee  emp1 = new Employee("tom", 5000);
        Employee  emp2 = new Employee("jee", 4000);
        Employee  emp3 = new Employee("abbc", 3000);
        Employee  emp4 = new Employee("tim", 2500);
        Employee  emp5 = new Employee("z", 1000);

        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);

        //按照salary从小到大排序
        for (Employee employee : treeSet) {
            System.out.println(employee.getName()+employee.getSalary());
        }















    }
}

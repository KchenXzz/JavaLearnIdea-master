package test.collection.list;

import horstmann.corejava.Employee;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * @projectName: JavaLearnIdea
 * @package: test.collection.list
 * @className: LinkedListTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-2 下午 8:42
 * @version: 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee("zhangsan", 100));
        list.add(new Employee("lisi", 200));
        list.add(new Employee("wangwu", 400));
        list.add(new Employee("tom", 130));

        list.forEach(System.out::println);

        list.sort((Comparator.comparingInt(Employee::getId)));











    }
}

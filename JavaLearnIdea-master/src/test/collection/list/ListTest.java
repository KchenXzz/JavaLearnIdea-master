package test.collection.list;

import horstmann.corejava.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @projectName: JavaLearnIdea
 * @package: test.collection.list
 * @className: ListTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-1 下午 5:55
 * @version: 1.0
 */
public class ListTest {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("zhangsan", 100));
        list.add(new Employee("lisi", 200));
        list.add(new Employee("wangwu", 400));
        list.add(new Employee("tom", 130));

        //按字典顺序
        list.sort(Comparator.comparing(Employee::getName));
        list.forEach(System.out::println);

        System.out.println("-------------");
        //按工资
        list.sort(Comparator.comparingDouble(Employee::getSalary));
        list.forEach(System.out::println);


//        ListIterator<Employee> iterator = list.listIterator();
//
//        while (iterator.hasNext()) {
//            iterator.next();
//            iterator.add(new Employee("新增"));
//        }
//        while (iterator.hasPrevious()){
//            iterator.previous();
//            iterator.remove();
//            iterator.previous();
//        }
//
//
//        list.forEach(System.out::println);


        //list.forEach(System.out::println);

//        list.add(1,new Employee("张飞"));
//        System.out.println("------------------------");
//        list.forEach(System.out::println);
//

//        System.out.println(list.size());


//        list.remove(new Employee("tom",130));
//        list.forEach(System.out::println);


//        List<Object> list1 = new ArrayList<>();
//        list1.add(new Employee("新集合"));
//        list1.addAll(list);
//        list1.forEach(System.out::println);


//        System.out.println(list.contains(new Employee("tom", 130)));
//        System.out.println(list.contains(new Employee("tom")));


//        Employee e1 = list.get(0);
//        System.out.println(e1);


    }
}

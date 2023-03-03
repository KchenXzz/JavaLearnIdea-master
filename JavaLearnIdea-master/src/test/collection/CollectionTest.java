package test.collection;

import horstmann.corejava.Employee;
import tool.arrays.MyTools;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @projectName: JavaLearnIdea
 * @package: test.collection.list.arrayList
 * @className: collection
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-1 上午 10:04
 * @version: 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {

        Collection<Employee> coll=new ArrayList<>();
        coll.add(new Employee("zhangsan",100));
        coll.add(new Employee("lisi",200));
        coll.add(new Employee("wangwu",400));
        coll.add(new Employee("tom",130));



//        System.out.println(iterator.next());//异常

        for (Employee e:
             coll) {
            System.out.println(e);
        }

        System.out.println("----------------");
        coll.forEach(System.out::println);

        System.out.println("----------------");
        coll.forEach(System.out::println);


        int[] arr= MyTools.createIntArray(5);

        for (int i : arr) {
            i=1;
        }
        //修改不了数组
        for (int i : arr) {
            System.out.println(i);
        }

    }


}

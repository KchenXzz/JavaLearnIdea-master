package test.map.hashMap;

import horstmann.corejava.Employee;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/2 18:21
 */
public class HashMapTest1 {

    public static void main(String[] args) {

        HashMap<Employee, String> map = new HashMap<>();
        Employee  emp1 = new Employee("张三", 2000);
        Employee  emp2 = new Employee("李四", 2000);
        Employee  emp3 = new Employee("王五", 2000);
        Employee  emp4 = new Employee("张三", 2500);
        map.put(emp1,"山东");
        map.put(emp2,"河北");
        map.put(emp3,"北京");
        map.put(emp4,"山东");

        map.forEach((emp,grand)-> System.out.println(emp+"的籍贯是"+grand));









    }


    
}

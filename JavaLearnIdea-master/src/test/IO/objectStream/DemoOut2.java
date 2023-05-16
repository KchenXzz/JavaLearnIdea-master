package test.IO.objectStream;

import horstmann.corejava.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/27 15:59
 */
public class DemoOut2 {
    public static void main(String[] args) throws IOException {

        /*
        多个对象序列化时，先把对象放到容器里，然后序列化容器，读的时候也就只需要读容器
        适用于不知道有多少个对象的时候
         */

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();


        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaLearnIdea-master\\src\\test\\IO\\objectStream\\demo2.txt"));

        oos.writeObject(employees);

        oos.close();

    }
}

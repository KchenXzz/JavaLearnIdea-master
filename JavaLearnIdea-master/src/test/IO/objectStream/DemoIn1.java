package test.IO.objectStream;

import horstmann.corejava.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/27 15:40
 */
public class DemoIn1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaLearnIdea-master\\src\\test\\IO\\objectStream\\demo1.txt"));

        Employee emp = (Employee) ois.readObject();

        System.out.println(emp.getName());
        System.out.println(emp);

        ois.close();
    }
}

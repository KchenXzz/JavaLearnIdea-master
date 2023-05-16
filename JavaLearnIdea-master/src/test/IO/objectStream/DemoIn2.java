package test.IO.objectStream;

import horstmann.corejava.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/27 16:02
 */
public class DemoIn2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaLearnIdea-master\\src\\test\\IO\\objectStream\\demo2.txt"));


        ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();

        for (Employee employee : list) {
            System.out.println(employee);
        }

        ois.close();

    }
}

package test.IO.objectStream;

import horstmann.corejava.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/27 15:32
 */
public class DemoOut1 {
    public static void main(String[] args) throws IOException {

        //要个这个类 实现Serializable接口,并且手动添加了版本号，hireday字段不参与序列化
        Employee employee = new Employee("张三",2000);

        //序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaLearnIdea-master\\src\\test\\IO\\objectStream\\demo1.txt"));
        oos.writeObject(employee);

        oos.close();

    }
}

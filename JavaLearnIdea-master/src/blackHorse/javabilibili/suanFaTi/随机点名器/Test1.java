package blackHorse.javabilibili.suanFaTi.随机点名器;

import test.collection.javabean.Student;

import java.util.HashMap;
import java.util.Random;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/20 19:29
 */
public class Test1 {
    public static void main(String[] args) {

        Student stu1 = new Student("张三", 20, 50, 33, 33);
        Student stu2 = new Student("王五", 45, 53, 33, 33);
        Student stu3 = new Student("李四", 23, 24, 33, 33);
        Student stu4 = new Student("炸藕云", 12, 98, 33, 33);
        Student stu5 = new Student("士大夫", 65, 67, 33, 33);

        HashMap<Integer,Student > map = new HashMap<>();

        map.put(1,stu1);
        map.put(2,stu2);
        map.put(3,stu3);
        map.put(4,stu4);
        map.put(5,stu5);

        dianMing(map);

    }

    private static void dianMing(HashMap<Integer, Student> map) {
        Random random = new Random();
        int num = random.nextInt(5) + 1;
        System.out.println("点个名，"+map.get(num).getName()+"?");

    }
}

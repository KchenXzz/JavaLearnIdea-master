package test.collection.set.treeSet;

import test.collection.javabean.Student;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @projectName: JavaLearnIdea
 * @package: test.collection.set.treeSet
 * @className: TreeSetTest2
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-10 上午 11:28
 * @version: 1.0
 */
public class TreeSetTest2 {
    public static void main(String[] args) {

        Student stu1 = new Student("tom", 16, 90, 52, 78,false);
        Student stu2 = new Student("jerry", 15, 87, 89, 32,true);
        Student stu3 = new Student("aim", 17, 88, 89, 73,true);
        Student stu4 = new Student("tim", 16, 99, 78, 43,true);
        Student stu5 = new Student("zz", 16, 87, 89, 32,true);
        Student stu6 = new Student("hhhh", 15, 87, 89, 32,true);
        Student stu7 = new Student("hhhh", 15, 87, 89, 32,true);

        /*
        对以上学生对象按照 总分 语文 数学 英语 年龄 姓名的优先级进行排序（由高到低）
        相同的不添加
         */
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o2.getSum() - o1.getSum();
                i=i==0?o2.getChScore()-o1.getChScore():i;
                i=i==0?o2.getMathScore()-o1.getMathScore():i;
                i=i==0?o2.getEngScore()-o1.getEngScore():i;
                i=i==0?o2.compareTo(o1):i;
                return i;
            }
        });

        System.out.println(treeSet.add(stu1));
        System.out.println(treeSet.add(stu2));
        System.out.println(treeSet.add(stu3));
        System.out.println(treeSet.add(stu4));
        System.out.println(treeSet.add(stu5));
        System.out.println(treeSet.add(stu6));
        System.out.println(treeSet.add(stu7));

        for (Student s : treeSet) {

            System.out.println(s);
        }

    }
}

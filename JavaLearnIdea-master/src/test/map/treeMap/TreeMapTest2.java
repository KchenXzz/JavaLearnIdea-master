package test.map.treeMap;

import test.map.Student;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/5 15:43
 */
public class TreeMapTest2 {
    public static void main(String[] args) {

        //这里没有在student类里面定义排序规则，是在创建map时才定义排序规则，如果两者都不定义会出错
        TreeMap<Student, String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {// 按照年龄排序，相同按照姓名字母顺序排序
                int val = o1.getAge()-o2.getAge();      // 同姓名年龄认为是同一个学生
                val=val==0?o1.getName().compareTo(o2.getName()):val;
                return val;
            }
        });


        Student  stu1 = new Student("张三", 12, 1);
        Student  stu2 = new Student("李四", 17, 28);
        Student  stu3 = new Student("王五", 17, 20);
        Student  stu4 = new Student("赵云", 27, 9);
        Student  stu5 = new Student("洪七公", 66, 777);
        Student  stu6 = new Student("洪七公", 66, 111);// 这个不会录入到map


        treeMap.put(stu1,"山东");
        treeMap.put(stu2,"苏州");
        treeMap.put(stu3,"东百");
        treeMap.put(stu4,"河北");
        treeMap.put(stu5,"重庆");
        treeMap.put(stu6,"新重庆"); //认为stu5跟stu6相同 新重庆覆盖重庆

        treeMap.forEach(((student, s) -> System.out.println("学生："+ student.toString()+" 的籍贯是： "+s) ));







    }
}

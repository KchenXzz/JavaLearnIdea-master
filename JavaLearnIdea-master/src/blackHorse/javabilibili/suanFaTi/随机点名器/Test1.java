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

        final boolean M=true;
        final boolean W=false;

        Student stu1 = new Student("张三", 20, 50, 33, 33,W);
        Student stu2 = new Student("王五", 45, 53, 33, 33,M);
        Student stu3 = new Student("李四", 23, 24, 33, 33,W);
        Student stu4 = new Student("炸藕云", 12, 98, 33, 33,W);
        Student stu5 = new Student("士大夫", 65, 67, 33, 33,W);

        HashMap<Integer,Student > map = new HashMap<>();

        map.put(1,stu1);
        map.put(2,stu2);
        map.put(3,stu3);
        map.put(4,stu4);
        map.put(5,stu5);

        dianMing(map);

    }

    /**
     * 实现点名第一步，男生70% 女生30%
     * @param map 存储学生信息的map
     */
    private static void dianMing(HashMap<Integer, Student> map) {
        Random random = new Random();
        int num = random.nextInt(10) ;
        if(num<=6){
            dianMing2(map,true);
        }else {
            dianMing2(map,false);
        }

    }

    /**
     * 第二部，实现对男女生的随机点名
     * @param gender 性别
     */
    private static void dianMing2(HashMap<Integer, Student> map,boolean gender){

        Random random=new Random();

        int index=random.nextInt(map.size())+1;

        while (true){
            if (map.get(index).getGender()==gender){
                System.out.println("点个名，"+map.get(index).getName());
                break;
            }
            index= random.nextInt(map.size())+1;
        }


    }
}

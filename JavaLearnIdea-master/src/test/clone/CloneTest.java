package test.clone;

import java.util.Arrays;

/**
 * @projectName: JavaLearnIdea
 * @package: test.clone
 * @className: CloneTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/5 16:48
 * @version: 1.0
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("fdsafds");

        int[] ints = {1, 2, 3};
        Stu stu1 = new Stu(12, "wuhu", ints);
        Stu stu2 = (Stu) stu1.clone();
        System.out.println(stu2.getAge() + stu2.getName() + Arrays.toString(stu2.getId()));
        stu2.setAge(13);
        stu2.setName("sss");
        ints[0] = 5;
        System.out.println(stu2.getAge() + stu2.getName() + Arrays.toString(stu2.getId()));
        System.out.println(stu1.getAge() + stu1.getName() + Arrays.toString(stu1.getId()));

    }
}

class Stu implements Cloneable {

    private int age;
    private String name;
    private int[] id;

    public Stu(int age, String name, int[] id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

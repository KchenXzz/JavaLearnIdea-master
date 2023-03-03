package test.constructor;

import horstmann.corejava.Employee;
import horstmann.corejava.Manager;

import java.util.Arrays;
import java.util.Comparator;

public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee[7];
        staff[0] = new Manager("mayun", 80000, 2000, 1, 1);
        //强制转换后 调用setBonus
        ((Manager) staff[0]).setBonus(9000);
        staff[1] = new Manager();
        staff[2] = new Manager("mahuateng", 90000, 2001, 2, 2);
        staff[3] = new Employee("Tom", 4000, 2000, 1, 2);
        staff[4] = new Employee(5000);
        staff[5] = new Employee("Tom", 4000, 2077, 1, 2);
        staff[6] = new Employee();
        for (Employee b : staff) {
            System.out.println(b);//调用toString
            System.out.println("thisHashCode=" + b.hashCode());
        }
        System.out.println("-------------------------------------");
        System.out.println(staff[5].equals(staff[3]));
        System.out.println(staff[3].equals(staff[5]));
        System.out.println(staff[1].equals(staff[6]));
        /*
        equals方法中加了ID的比较，每录入的员工生成的ID都不一样，除非删除字段ID的比较
         */
        System.out.println(Arrays.hashCode(staff));
        System.out.println("-------------------------------------");
        //排序，可以根据Employee的getName,getDate等方法来排序
        Arrays.sort(staff, Comparator.comparing((Employee::getDate)));
        for (Employee b : staff) {
            System.out.println(b);//调用toString
            System.out.println("thisHashCode=" + b.hashCode());
        }

    }
}

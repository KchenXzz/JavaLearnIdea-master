package test.system;

import horstmann.corejava.Employee;
import horstmann.corejava.Manager;

/**
 * @projectName: JavaLearnIdea
 * @package: test.system类
 * @className: ArrayCopyTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/5 11:36
 * @version: 1.0
 */
public class ArrayCopyTest {
    public static void main(String[] args) {
        //System.arraycopy();
        /*
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] arr1=new int[20];
        System.arraycopy(arr,0,arr1,4 ,10);
        for (int e:arr1){
            System.out.print(e+" ");
        }

         */
        Employee employee1=new Employee("emp1",80000,2000,1,1);
        Employee employee2=new Manager("emp2",80000,2000,1,1);
        Employee employee3=new Employee("emp3",80000,2000,1,1);
        Employee[] employees={employee1,employee2,employee3};

        Employee[] employees1=new Employee[3];
        System.arraycopy(employees,0,employees1,0,3);

        for (Employee e:employees1) {
            System.out.println(e.getName());
        }
        //修改数组employees里元素的值，employee实例对象就会改变，
        employees[1].setName("xin");
        for (Employee e:employees1) {
            System.out.println(e.getName());
        }
        //存储引用数据类型存储的是地址，基本数据类型不是地址，地址对应的元素改变，引用它的所有的引用数据都会改变




    }
}

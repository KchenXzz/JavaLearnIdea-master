package blackHorse.javabilibili.suanFaTi.对象排序;

import horstmann.corejava.Employee;

import java.util.Arrays;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.对象排序
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-31 下午 5:00
 * @version: 1.0
 */
public class Test {
    /**
     * 定义数组存对象 Emp
     * 利用Arrays中的sort方法排序
     * 属性 年 工资 姓名
     * 按照年排序，年相同按照工资排序，工资一样按照姓名字母排序
     */
    public static void main(String[] args) {
        Employee[] arr=new Employee[5];

        arr[0]=new Employee("tom",2000);
        arr[1]=new Employee("zed",2000,2023,12,12);
        arr[2]=new Employee("jerry",1000,2008,8,8);
        arr[3]=new Employee("duck",5000,2020,1,1);
        arr[4]=new Employee("aim",2500,2020,9,9);


        Arrays.sort(arr,((o1, o2) -> {
            if(o1.getYear() !=o2.getYear()){
                return o1.getYear()-o2.getYear();
            }else if(o1.getSalary()!=o2.getSalary()){
                double temp = o1.getSalary() - o2.getSalary();
                if(temp<0) {  //temp 不能强转int！   因为0.1会变成0
                    return -1;
                }else return 1;
            }else
                return o1.getName().charAt(0)-o2.getName().charAt(0);
        }));

        for (Employee e:arr
             ) {
            System.out.println(e.getYear()+" "+e.getSalary()+" "+ e.getName());
        }


    }



}

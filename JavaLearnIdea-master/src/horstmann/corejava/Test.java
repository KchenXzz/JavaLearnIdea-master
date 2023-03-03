package horstmann.corejava;

/**
 * @projectName: JavaLearnIdea
 * @package: horstmann.corejava
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2022/12/29 14:05
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Employee employee=new Manager();
        //不能调用子类特有的方法，因为这方法是在子类定义的，父类没有这个方法
        System.out.println(employee);

       // System.out.println(employee.getBonus());

        Employee e=new Employee();
        Manager m=new Manager();
        System.out.println(m.getBonus());

    }
}

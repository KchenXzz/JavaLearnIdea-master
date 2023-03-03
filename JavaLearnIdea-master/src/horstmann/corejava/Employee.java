package horstmann.corejava;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

/**
 * @projectName: JavaLearnIdea
 * @package: horstmann.corejava
 * @className: Employee
 * @author: Kchenx
 * @description: 简单员工类 ID字段未列入equels 和 hashcode的比较中
 * @date: 2022-X-X 下午 5:55
 * @version: 1.0
 */
public class Employee implements Comparable<Employee>,Cloneable {
    /**
     * 员工类
     */
    private static int nextId;

    private int id;
    private String name;
    private LocalDate hireDay;
    private double salary;


    static {
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.now();
    }

    public Employee(String name) {
        this.name = name;
        salary = 0;
        hireDay = LocalDate.now();
    }

    public Employee(double salary) {
        this("Employee#" + nextId, salary);//其实是使用（String，S）的构造函数 "Employee #"+nextId 形成一个字符串加上S
    }

    public Employee() {
        name = "nullStaff";
        salary = 0;
        hireDay = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name=newName;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }


    public void raiseSalary(double byPercent) {
        salary = salary * (byPercent + 100) / 100;
    }

    public LocalDate getDate() {
        return hireDay;
    }

    public int getYear(){
        return this.getDate().getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0
                && name.equals(employee.name)
                && hireDay.equals(employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hireDay, salary);
    }

    public String toString() {
        return "[name=" + name +
                        ",ID=" + id +
                        ",salary=" + salary +
                        ",hireDay=" + hireDay +
                        "]";
    }

    @Override
    public int compareTo(Employee obj) {
        return Double.compare(salary, obj.salary);
    }

    @Override
    public Employee clone() {
        try {
            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部项
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

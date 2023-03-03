package dataStructure.stack.stackTest;

import horstmann.corejava.Employee;

import java.util.Stack;

public class JavaStackTest {
    public static void main(String[] args) {
        Stack<Employee> stack = new Stack<>();
        var l1 = new Employee("wuhu1", 3000, 2022, 12, 7);
        var l2 = new Employee("wuhu2", 3000, 2022, 12, 7);
        var l3 = new Employee("wuhu3", 3000, 2022, 12, 7);
        var l4 = new Employee("wuhu4", 3000, 2022, 12, 7);
        var l5 = new Employee("wuhu5", 3000, 2022, 12, 7);
        System.out.println("元素个数》》》" + stack.size());
        System.out.println("是否为空》》》" + stack.isEmpty());
        System.out.println("压栈l1");
        stack.push(l1);
        System.out.println("压栈l2");
        stack.push(l2);
        System.out.println("压栈l3");
        stack.push(l3);
        System.out.println("压栈l4");
        stack.push(l4);
        System.out.println("压栈l5");
        stack.push(l5);
        System.out.println("是否为空》》》" + stack.isEmpty());
        System.out.println("元素个数》》》" +stack.size());
        System.out.println("得到栈顶元素》" + stack.peek());
        System.out.println("------------------------------");
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            System.out.println("弹栈》》》》》" + stack.pop());
            System.out.println("元素个数》》》" + stack.size());
            System.out.println("是否为空》》》" + stack.isEmpty());
            //System.out.println("得到栈顶元素》" + stack.peek());
            System.out.println();
        }
        System.out.println("压栈l1");
        stack.push(l1);
        System.out.println("压栈l2");
        stack.push(l2);
        System.out.println("压栈l3");
        stack.push(l3);
        System.out.println("压栈l4");
        stack.push(l4);
        System.out.println("压栈l5");
        stack.push(l5);
        System.out.println("清空栈");
        stack.clear();
        //System.out.println("弹栈》》》》》" + stack.pop());
        //System.out.println("元素个数》》》" + stack.size());
        //System.out.println("是否为空》》》" + stack.isEmpty());
        //System.out.println("得到栈顶元素》" + stack.peek());


    }
}

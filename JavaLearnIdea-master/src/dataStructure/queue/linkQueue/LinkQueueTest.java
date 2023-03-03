package dataStructure.queue.linkQueue;

import horstmann.corejava.Employee;
import horstmann.corejava.Manager;

public class LinkQueueTest {
    public static void main(String[] args) {
        LinkQueue<Employee> sqQueue = new LinkQueue<>();
        var l1 = new Employee("wuhu1", 3000, 2022, 12, 7);
        var l2 = new Manager("wuhu2", 3000, 2022, 12, 7);
        var l3 = new Employee("wuhu3", 3000, 2022, 12, 7);
        var l4 = new Employee("wuhu4", 3000, 2022, 12, 7);
        var l5 = new Employee("wuhu5", 3000, 2022, 12, 7);
        var l6 = new Employee("wuhu6", 3000, 2022, 12, 7);
        var l7 = new Employee("wuhu7", 3000, 2022, 12, 7);
        System.out.println("入队 l1~l7");
        //这时会溢出，测试自动扩容sqQueue，size*2
        sqQueue.add(l1);
        sqQueue.add(l2);
        sqQueue.add(l3);
        sqQueue.add(l4);
        sqQueue.add(l5);
        sqQueue.add(l6);
        sqQueue.add(l7);
        System.out.println("show方法");
        System.out.println("是否为空？"+sqQueue.isEmpty());
        System.out.println("取队头元素"+sqQueue.getHead());
        System.out.println("元素个数："+sqQueue.getCount());
        System.out.println();
        System.out.println("出队-》"+sqQueue.pop());
        System.out.println("元素个数："+sqQueue.getCount());
        System.out.println("出队-》"+sqQueue.pop());
        System.out.println("元素个数："+sqQueue.getCount());
        System.out.println("出队-》"+sqQueue.pop());
        System.out.println("元素个数："+sqQueue.getCount());
        System.out.println("出队-》"+sqQueue.pop());
        System.out.println("元素个数："+sqQueue.getCount());
        System.out.println("出队-》"+sqQueue.pop());
        System.out.println("元素个数："+sqQueue.getCount());
        System.out.println("出队-》"+sqQueue.pop());
        System.out.println("元素个数："+sqQueue.getCount());
        System.out.println("出队-》"+sqQueue.pop());
        System.out.println("元素个数："+sqQueue.getCount());

        System.out.println("-----------------------");
        System.out.println("清空队列");
        sqQueue.clear();
        System.out.println("是否为空？"+sqQueue.isEmpty());
        System.out.println("取队头元素"+sqQueue.getHead());
        System.out.println("元素个数："+sqQueue.getCount());






    }
}

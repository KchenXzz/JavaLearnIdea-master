package blackHorse.javabilibili.suanFaTi.约瑟夫问题;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.leetCode.约瑟夫问题
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/17 15:32
 * @version: 1.0
 */
public class Test {
    /*
    约瑟夫问题是个有名的问题：N个人围成一圈，从第一个开始报数，第M个将被杀掉，最后剩下一个，其余人都将被杀掉。例如N=6，M=5，被杀掉的顺序是：5，4，6，2，3。
分析：
（1）由于对于每个人只有死和活两种状态，因此可以用布尔型数组标记每个人的状态，可用true表示死，false表示活。
（2）开始时每个人都是活的，所以数组初值全部赋为false。
（3）模拟杀人过程，直到所有人都被杀死为止。
     */
    public static void main(String[] args) {
        /*
        用链表实现
        初始化
        长度 是41  依次存1~41 的值
        循环
        遍历表 同事count计数1~3，到3 杀死 删除节点
        然后继续遍历
        直到最后还有两个节点
        输出这两个节点的值
         */

        //初始化
//        长度 是41  依次存1~41 的值
        Node first = null;
        Node pre = null;
        for (int i = 1; i < 42; i++) {
            if (i == 1) {
                first = new Node(i, null);
                pre = first;
                continue;
            }
            Node node = new Node(i, null);
            pre.setNext(node);
            pre = node;
            if (i == 41) {
                pre.setNext(first);
            }
        }


        //循环
        /*
        遍历表
        count计数1~3，如果3 杀死 删除节点
        然后继续遍历
        直到最后还有两个节点
        输出这两个节点的值
         */

        int count=0;
        Node node = first;

        //记录上一个节点
        Node s=null;
        while (node != node.getNext().getNext()) {

            count++;
            if(count==3){
                //删除这个节点
                //打印删除的值
                System.out.print(node.getDate()+", ");
                s.setNext(node.getNext());
                count=0;
                node=node.getNext();
            }else {
                //移向下一个个节点
                s=node;
                node=node.getNext();
            }
        }
        System.out.println();
        System.out.println("最后两个");
        System.out.println(node.getDate());
        node=node.getNext();
        System.out.println(node.getDate());
    }
}

class Node {
    private int date;
    private Node next;

    public Node() {
        this.next = this;
    }

    public Node(int date) {
        this.date = date;
        this.next = this;
    }

    public Node(int date, Node next) {
        this.date = date;
        this.next = next;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

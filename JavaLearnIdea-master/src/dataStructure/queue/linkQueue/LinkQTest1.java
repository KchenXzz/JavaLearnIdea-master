package dataStructure.queue.linkQueue;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.queue.linkQueue
 * @className: LinkQTest1
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-5 下午 5:16
 * @version: 1.0
 */
public class LinkQTest1 {
    public static void main(String[] args) {
        //测试利用队列分层遍历二叉树出现的空指针引用
        //等价于向空队调用出队操作
        LinkQueue<Integer> queue = new LinkQueue<>();
        queue.add(1);
        queue.add(1);
        queue.add(1);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());


    }
}
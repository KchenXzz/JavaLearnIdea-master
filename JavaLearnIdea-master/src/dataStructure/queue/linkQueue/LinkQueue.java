package dataStructure.queue.linkQueue;

import dataStructure.queue.EmptyQueueException;
import dataStructure.queue.sqQueue.MyQueue;

/**
 * 队列的链式实现
 * 链队可以不定义大小，动态扩容，因为队列是在两头操作，所以链队比顺序队要好
 */
public class LinkQueue<E> implements MyQueue<E>{

    //链队列
    //头指针，尾指针
    private QNode<E> first;
    private QNode<E> last;
    //元素个数
    private int size;

    /**
     * 构造方法
     */
    public LinkQueue() {
        //创建一个节点
        this.first = new QNode<>();
        this.last = this.first;
        this.size = 0;
    }

    /**
     * 清空队列
     */
    @Override
    public void clear() {
        //将first节点的数据域和next置空--->NullPointerException because "this.first" is null
        //first.setNext(null);
        //first.setData(null);
        //last和first都指向这个空节点
        this.first = new QNode<>();
        this.last = this.first;
        this.size = 0;
    }

    /**
     * 判断是否为空
     * @return 空 TRUE
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     *  返回队列元素个数
     * @return 元素个数
     */
    @Override
    public int getCount() {
        return this.size;
    }

    /**
     * 取队头元素
     * @return 队头元素
     */
    @Override
    public E getHead() {
        //队空调用抛出异常
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        return this.first.getData();
    }

    /**
     * 入队，向队尾添加元素
     * @param data 要添加的元素
     */
    @Override
    public void add(E data) {
        //先判断队列是不是空队
        if (last.getData() == null) {
            //空队就直接把data赋值给last节点的data域，此时第一个节点的data域是空
            last.setData(data);
            size++;
            return;
        }
        //不是空队就要新建一个节点存data，
        QNode<E> node = new QNode<>(data);
        //新节点接到last后面 --->  first后面才对！
        last.setNext(node);
        //!!!!问题出在这  在第二次添加元素时 重新让first和last指向同一位置
       if(size==1){
           first=last;
       }
        //再让last指向新节点
        last = last.getNext();
        size++;
    }

    /**
     *  出队
     * @return node
     */
    @Override
    public E pop() {
        //队空调用抛出异常
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        //出队，出first指向的节点的data域
        E node = first.getData();
        //first 指向下一节点
        first = first.getNext();
        size--;
        return node;
    }
}

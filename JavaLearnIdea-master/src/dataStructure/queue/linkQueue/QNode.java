package dataStructure.queue.linkQueue;

public class QNode<E> {
    /**
     * 队列链式存储的节点类
     * 节点存Object类型对象data
     * 有一个next域指向下一个节点
     */
    private E data;
    private QNode<E> next;

    //构造方法
    public QNode() {
        this.data = null;
        this.next = null;
    }

    public QNode(E data) {
        this.data = data;
        this.next = null;
    }

    public QNode(E data, QNode<E> next) {
        this.data = data;
        this.next = next;
    }


    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public QNode<E> getNext() {
        return next;
    }

    public void setNext(QNode<E> next) {
        this.next = next;
    }
}

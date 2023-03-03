package dataStructure.queue.sqQueue;

/**
 *
 * @param <E>
 */
public interface MyQueue<E> {

    /**
     * 清空队列
     */
    void clear();

    /**
     * 判断是否为空
     */
    boolean isEmpty();

    /**
     * 获取元素个数
     */
    int getCount();

    /**
     * 取队头元素
     */
    E getHead();

    /**
     * 入队
     */
    void add(E data);

    /**
     * 出队
     */
    E pop();

}

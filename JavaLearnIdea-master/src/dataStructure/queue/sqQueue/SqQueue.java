package dataStructure.queue.sqQueue;

import dataStructure.queue.EmptyQueueException;

import java.util.Arrays;

public class SqQueue implements MyQueue {
    /**
     * 队列的顺序实现
     * 顺序队：数组实现，在创建时占用固定内存，溢出可以扩容，拥有顺序表的有点与缺点
     * 队列操作只能头删尾插
     * 逻辑关系一对一
     * 运算规则 只能在首尾进行操作，FIFO结构，先进先出
     * 常用操作，入队，出队
     */
    //顺序表实现，用数组，默认容量10，溢出就扩容
    private Object[] data;
    //对入队出计数，便于判断队是否满，和是否为空
    //计数
    private int count;
    //队头指针
    private int first;
    //队尾指针
    private int last;
    //数组大小
    private int size;


    //默认容量10
    //构造方法
    public SqQueue(int size) {
        this.data = new Object[size];
        this.size = size;
        this.count = 0;
        this.first = 0;
        this.last = 0;


    }

    //是否溢出
    private boolean isFull() {
        return count == size;
    }


    //清空队列
    @Override
    public void clear() {
        this.count = 0;
        this.first = 0;
        this.last = 0;
        this.data = new Object[size];

    }

    //是否为空
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    //返回元素数量
    @Override
    public int getCount() {
        return count;
    }

    //取队头元素
    @Override
    public Object getHead() {
        //队空调用抛出异常
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        return  data[first];
    }

    //向队尾添加元素
    @Override
    public void add(Object data) {
        //不能像顺序表一样动态扩充
        //this.data= Arrays.copyOf(this.data,this.size*2);
        //因为
        //循环对列，如果尾指针在数组的位置比头指针靠前，扩容后数组变长，增加的那部分是空的，出队的时候就会空指针异常
        //如果非要实现扩容，就要新生成个数组再把就数组的元素依次放到新数组
        //定义新数组，按照从头指针指的元素先放得顺序，依次放大新数组
        if (isFull()) {
            //暂存数组data
            Object[] arr = Arrays.copyOf(this.data, size);
            //Object[] arr=new Object[size];
            // System.arraycopy(this.data,0,arr,0,size);
            //新数组，长度翻倍
            this.data = new Object[size * 2];
            //循环count次因为有count个元素
            for (int i = 0; i < count; i++) {
                //把旧数组里的元素，从头结点依次放到新数组里
                this.data[i] = arr[first];
                first = (first + 1) % size;
            }
            //更新指针，将头指针尾指针指向新数组对应位置
            //first指向第一个位置
            first = 0;
            //last指向最后一个元素的下一个位置
            last = count;
            //切记更新size
            size = size * 2;
        }
        this.data[last] = data;
        last = (last + 1) % size;
        count++;
    }

    //出队，返回队头元素，队长度减一
    @Override
    public Object pop() {
        //队空调用抛出异常
        if (isEmpty()) {
            throw new EmptyQueueException();
        }

        Object elem = data[first];
        first = (first + 1) % size;
        count--;
        return elem;
    }

    //虽然队列不能遍历，但这是一个遍历的方法
    void show() {
        int f = this.first;
        for (int i = 0; i < count; i++) {
            System.out.println(data[f]);
            f = (f + 1) % size;
        }
    }

}

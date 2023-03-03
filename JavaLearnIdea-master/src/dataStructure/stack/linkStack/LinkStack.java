package dataStructure.stack.linkStack;

import java.util.EmptyStackException;

public class LinkStack implements MyStack {
    /**
     * 简单链栈的实现
     * 后进先出（LIFO）结构，只能在栈顶操作，提供top指针
     * 节点Node类，存储object对象
     */
    //顶指针
    private SNode top;
    private int size;

    //构造方法，调用top指向节点的默认构造方法
    public LinkStack() {
        top = new SNode();
        size = 0;
    }


    //清空栈
    @Override
    public void clear() {
        //top=null;错误的空指针异常
        //让top的next不指向任何node，top的next就不被任何对象引用，变成垃圾被回收（栈内的所有元素都被回收）
        top.setNext(null);
        top.setData(null);
        size = 0;
    }

    //压栈，提供一个object对象压进栈
    @Override
    public void push(Object date) {
        //先判断栈是不是空栈
        if (top.getData() == null) {
            //空栈就直接把top的data域赋值data
            top.setData(date);
            size++;
            return;
        }
        //不是空栈就要新建一个节点存data，让top指向这个新节点
        top = new SNode(date, top);
        size++;

    }

    //弹栈，返回弹出的对象，栈长度--
    @Override
    public Object pop() {
        //先判读是不是空栈
        if (this.size() == 0) {
            //空栈抛出栈空异常
            throw new EmptyStackException();
        }
        //定义个节点存top指向的元素
        SNode node = top;
        //top指向top.next,先判断top.next是不是空，如果空，top=top.next就会有空指针异常
        top = top.getNext() == null ? new SNode() : top.getNext();
        size--;
        //返回弹出的对象
        return node.getData();
    }

    //取栈顶元素
    @Override
    public Object peek() {
        //先判读是不是空栈
        if (this.size() == 0) {
            //空栈抛出栈空异常
            throw new EmptyStackException();
        }
        return top.getData();
    }

    //判断是否为空栈
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //得到栈的长度
    @Override
    public int size() {
        return size;
    }


}

package dataStructure.stack.linkStack;

public interface MyStack {
    /**
     * 自定义栈的接口
     *
     *
     *
     */
    //清空栈
    void clear();

    //压栈
    void push(Object date);

    //弹栈
    Object pop();


    //取栈顶元素
    Object peek();


    //判断是否为空
    boolean isEmpty();

    //返回栈的长度
    int size();

}

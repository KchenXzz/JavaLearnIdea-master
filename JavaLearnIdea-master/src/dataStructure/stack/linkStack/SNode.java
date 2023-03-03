package dataStructure.stack.linkStack;

public class SNode {

    //字段
    private Object data;
    //指针，指向上一个入栈的元素
    private SNode next;

    //默认构造方法，栈初始化调用
    public SNode() {
        this.data = null;
        this.next = null;
    }

    //构造方法，栈初始化调用
    public SNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public SNode(Object data, SNode next) {
        this.data = data;
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(SNode next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public SNode getNext() {
        return next;
    }
}


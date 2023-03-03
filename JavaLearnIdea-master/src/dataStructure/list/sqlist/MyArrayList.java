package dataStructure.list.sqlist;

import java.util.Arrays;

public class MyArrayList {
    //用int型的数组来实现顺序表，可以自定义其他类型
    private int[] elem;
    //顺序表的元素数量
    private int usedSize;
    //默认容量 10
    private static final int SIZE=10;

    public MyArrayList(int usedSize) {
        this.elem=new int[SIZE];
        this.usedSize=usedSize;
        if (this.isFull()) {
            //对数组elem扩容
            this.elem = Arrays.copyOf(this.elem, this.usedSize+1);

        }
    }
    //得到数组长度
    public void getArrayLength(){
        System.out.println(elem.length);
    }


    /*
    打印顺序表
     */
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
    /*
    获取顺序表长度
     */
    public int size() {
        return this.usedSize;
    }
    //判断当前顺序表是否溢出的方法
    public boolean isFull() {
        if (this.elem.length <= this.usedSize) {
            return true;
        }
        return false;
    }
    //判断当前顺序表是否为空
    private boolean isEmpty() {
        if (this.usedSize == 0) {
            return true;
        }
        return false;
    }
    /*
    在顺序表最后位置新增元素的add方法
     */
    public void add(int data) {
        if (this.isFull()) {
            //对数组elem扩容
            this.elem = Arrays.copyOf(this.elem, this.usedSize+1);
        }
        this.elem[this.usedSize] = data;
        this.usedSize++;
        System.out.println("ok!");
    }
    /*
    在顺序表指定位置插入元素的add方法 复杂度O（n）
     */
    public void add(int pos, int data) {
        if (this.isFull()) {
            this.elem = Arrays.copyOf(this.elem, this.usedSize+1);
        }
        if (pos < 0 || pos > this.usedSize) {
            throw new PosWrongfulException("pos位置不合法");
        }
        for (int i = this.usedSize - 1; i >= pos-1; i--) {
            this.elem[i + 1] = this.elem[i];//复杂度在于这个循环
        }
        this.elem[pos-1] = data;
        this.usedSize++;
        System.out.println("ok!");
    }


    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i+1;
            }
        }
        return -1;
    }
    // 给 pos 位置的元素设为【更新为】 value
    public void set(int pos, int value) {
        if (this.isEmpty()) {
            throw new PosWrongfulException("顺序表里没有元素");
        }
        if (pos < 0 || pos > this.usedSize) {
            throw new PosWrongfulException("pos位置不合法");
        }
        this.elem[pos-1] = value;
    }

    // 删除第一次出现的值为value的元素
    public void remove(int value) {
        if (this.isEmpty()) {
            throw new PosWrongfulException("顺序表里没有元素");
        }
        int index = this.indexOf(value);
        if(index != -1) {
            for (int i = index; i < this.usedSize; i++) {
                this.elem[i - 1] = this.elem[i];
            }
            this.usedSize--;
            System.out.println("已删除");
        }else System.out.println("表中没有此元素！");
    }
    //删除指定位置的元素
    public void delete(int key){
        if(isEmpty()) {
            throw new PosWrongfulException("顺序表里没有元素");
        }
        if(key<1||key>usedSize){
            throw new PosWrongfulException("输入位置有误");
        }
        int value=elem[key-1];
        for (int i = key; i < this.usedSize; i++) {
            this.elem[i - 1] = this.elem[i];
        }
        this.usedSize--;
        System.out.println("已删除"+value);
    }
    // 清空顺序表
    public void clear() {
        /*for (int i = 0; i < this.usedSize; i++) {
            this.elem[i] = null;
        }*/
        this.usedSize = 0;
    }
    /* 清空顺序表
    public void clear() {
        this.elem = new int[SIZE];
        this.usedSize = 0;
    }
     */
}

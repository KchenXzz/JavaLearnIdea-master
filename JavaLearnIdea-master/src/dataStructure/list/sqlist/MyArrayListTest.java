package dataStructure.list.sqlist;

public class MyArrayListTest {
    public static void main(String[]args){
        /*
        Java用ArrayList泛型类实现了顺序表
         */
        var SqL=new MyArrayList(15);
        SqL.display();
        System.out.println("表中元素个数："+SqL.size());
        System.out.println("是否溢出？"+SqL.isFull());
        System.out.print("实现表的数组的长度：");
        SqL.getArrayLength();
        System.out.println("给表依次插入1~15的自然数");
        for (int i=1;i<=15;i++){
            SqL.set(i,i);
        }
        System.out.print("默认在表尾插入2 ");
        SqL.add(2);
        SqL.display();
        System.out.print("在第2个位置插入6 ");
        SqL.add(2,6);
        SqL.display();
        System.out.println("表中元素个数："+SqL.size());
        System.out.println( "是否包含2？"+SqL.contains(2));
        System.out.println( "是否包含16？"+SqL.contains(16));
        System.out.println( "元素2在哪个位置？"+SqL.indexOf(2));
        System.out.println( "元素16在哪个位置？"+SqL.indexOf(16));
        System.out.println("将第3个位置改为4");
        SqL.set(3,4);
        System.out.println("将第14个位置改为4");
        SqL.set(14,4);
        System.out.println( "元素4在哪个位置？"+SqL.indexOf(4));
        SqL.display();
        System.out.println("删除第一次出现的<2>这个元素");
        SqL.remove(2);
        System.out.println("删除第一次出现的<99>这个元素");
        SqL.remove(99);
        System.out.println("删除第2个元素");
        SqL.delete(2);
        //System.out.println("删除第99个元素");
        //SqL.delete(99);
        SqL.display();
        System.out.println("表中元素个数："+SqL.size());
        System.out.println("清空顺序表");
        SqL.clear();//清空后usedSize=0，
        SqL.display();//打印时啥都没有




    }
}

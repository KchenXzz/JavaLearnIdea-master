package test.arrayCopy;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        /**
         * JAVA语言的下面几种数组复制方法
         *
         * A.for循环逐一复制
         * B.System.arraycopy
         * C.System.copyof
         * D.使用clone方法
         * E.Arrays.copyOf(dataType[] srcArray,int length);
         * F.Arrays.copyOfRange(dataType[] srcArray,int startIndex,int endIndex);
         * 效率：System.arraycopy > clone > Arrays.copyOf > for循环
         * 这几种都是生成新数组
         * 不是引用同一个，地址不一样
         *
         */
        int[] arr={1, 2, 3, 4, 5};

        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        System.out.println("原数组 arr ");
        show(arr);

        //A* A.for循环逐一复制
        System.arraycopy(arr, 0, a, 0, arr.length);
        System.out.println("A.for循环逐一复制");
        show(a);

        // * B.System.arraycopy
        System.arraycopy(arr, 0, b, 0, 5);
        System.out.println("B.System.arraycopy");
        show(b);

        //C.System.copyof
        //System.copyof  太麻烦

        //D.使用clone方法
        int[]d =arr.clone();
        System.out.println("D.使用clone方法");
        show(d);


        //E.Arrays.copyOf(dataType[] srcArray,int length);
        int[] e= Arrays.copyOf(arr,5);
        System.out.println("E.Arrays.copyOf(dataType[] srcArray,int length)");
        show(e);

        //F.Arrays.copyOfRange(dataType[] srcArray,int startIndex,int endIndex);
        int[] f=Arrays.copyOfRange(arr,0,5);
        System.out.println("F.Arrays.copyOfRange(dataType[] srcArray,int startIndex,int endIndex)");
        show(f);

        System.out.println("----------------------");
        System.out.println("修改原数组arr[0]=9");
        arr[0]=9;
        System.out.println("原数组 arr ");
        show(arr);
        System.out.println("A.for循环逐一复制");
        show(a);
        System.out.println("B.System.arraycopy");
        show(b);
        System.out.println("D.使用clone方法");
        show(d);
        System.out.println("E.Arrays.copyOf(dataType[] srcArray,int length)");
        show(e);
        System.out.println("F.Arrays.copyOfRange(dataType[] srcArray,int startIndex,int endIndex)");
        show(f);
    }
    public static void show(int[] d){
        System.out.print("地址 "+d+"] 元素：[");
        for (int q:d){
            System.out.print(" "+q);
        }
        System.out.println(" ]");
        System.out.println();
    }
}
package test.XOR;

import tool.arrays.MyTools;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/9 20:54
 */
public class Test {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};


        System.out.println("异或运算");
        int a=arr[0];
        for (int i : arr) {
            System.out.print(Integer.toBinaryString(a)+"^"+Integer.toBinaryString(i)+"--->");
            System.out.println(a+"^"+i+"="+(a^i));
        }

        System.out.println("按位与运算");
        for (int i : arr) {
            System.out.print(Integer.toBinaryString(a)+"^"+Integer.toBinaryString(i)+"--->");
            System.out.println(a+"&"+i+"="+(a&i));
        }

        System.out.println("按位或运算");
        for (int i : arr) {
            System.out.print(Integer.toBinaryString(a)+"|"+Integer.toBinaryString(i)+"--->");
            System.out.println(a+"|"+i+"="+(a|i));
        }



        System.out.println("按位取反");
        for (int i : arr) {
            System.out.print("~"+Integer.toBinaryString(i)+"--->");
            System.out.println("~"+i+"="+(~i));
        }

        System.out.println("左移运算");
        for (int i : arr) {
            System.out.print(Integer.toBinaryString(a)+"<<"+Integer.toBinaryString(i)+"--->");
            System.out.println(a+"<<"+i+"="+(a<<i));
        }


        System.out.println("右移运算");
        for (int i : arr) {
            System.out.print(Integer.toBinaryString(i)+">>"+Integer.toBinaryString(a)+"--->");
            System.out.println(i+">>"+a+"="+(i>>a));
        }

        System.out.println("有符号右移运算");
        for (int i : arr) {
            System.out.print(Integer.toBinaryString(-i)+">>>"+Integer.toBinaryString(a)+"--->");
            System.out.println(i+">>>"+a+"="+(-i>>>a));
        }












    }
}

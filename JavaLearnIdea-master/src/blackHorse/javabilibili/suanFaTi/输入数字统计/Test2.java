package blackHorse.javabilibili.suanFaTi.输入数字统计;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.输入数字统计
 * @className: Test2
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-19 下午 9:10
 * @version: 1.0
 */
public class Test2 {
    /**
     * 键盘录入 1~100之间整数
     * 并添加到集合里
     * 直到他们的值得和超过200
     */
    public static void main(String[] args) {
        //集合
        ArrayList<Integer> integers = new ArrayList<Integer>();
        //录入
        Scanner sc =new Scanner(System.in);
        //判断
        while (!(getCount(integers)>200)){
            //判断合法性  1~100
            int anInt = sc.nextInt();
            if(anInt<1||anInt>100){
                System.out.println("输入不合法，重新输入");
            }else {
                System.out.println("输入合法，已添加");
                integers.add(anInt);
            }
        }
        sc.close();
        System.out.println("满足要求 "+getCount(integers));

        for (Integer i: integers) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static int getCount(ArrayList<Integer> integers) {
        int count =0;
        for (Integer integer : integers) {
            count = integer + count;
        }
        return count;
    }
}

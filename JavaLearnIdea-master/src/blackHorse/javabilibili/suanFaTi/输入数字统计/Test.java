package blackHorse.javabilibili.suanFaTi.输入数字统计;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * 屏幕输入0~9的值，然后给出每个值出现的次数
         * 1 用顺序表存储输入的值
         * 2 依次拿出来判断
         */

        //定义个存储int类型的顺序表来存键盘输入
        ArrayList<Integer> list = new ArrayList<>();
        //屏幕输入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入(-1 结束输入)");
            int in = sc.nextInt();
            if (in == -1) {
                System.out.println("结束输入");
                break;
            }
            if (in >= 0 && in <= 9) {
                //输入的值存到顺序表
                list.add(in);
            } else System.out.println("输入不合法");
        }

        //输入完之后开始算每个值出现的次数
        //定义一个新数组[10]，下标0~9正好存顺序表里值出现的次数
        int[] count = new int[10];
        //遍历顺序表
        for (Integer integer : list) {
            //判断值是多少
            //判断 switch ()1,2,3,4...9
            switch (integer) {
                //出现一次累加
                case 0 -> count[0] = count[0] + 1;
                case 1 -> count[1] = count[1] + 1;
                case 2 -> count[2] = count[2] + 1;
                case 3 -> count[3] = count[3] + 1;
                case 4 -> count[4] = count[4] + 1;
                case 5 -> count[5] = count[5] + 1;
                case 6 -> count[6] = count[6] + 1;
                case 7 -> count[7] = count[7] + 1;
                case 8 -> count[8] = count[8] + 1;
                case 9 -> count[9] = count[9] + 1;
            }
        }
        System.out.print("输入的是          :");
        System.out.println(list);
        int i = 0;
        System.out.print("0~9出现的次数分别是:[");
        for (int e : count) {
            System.out.print(e);
            if (i == count.length - 1) {
                System.out.println("]");
            } else System.out.print(", ");
            i++;
        }
    }
}

package blackHorse.javabilibili.suanFaTi.打乱数组;

import java.util.HashSet;
import java.util.Random;

public class DaluanTest {
    public static void main(String[] args) {
        /**
         *打乱数组中所有元素的顺序
         * 【1,2,3,4,5】-->>[2,3,4,5,1]
         *
         *
         */
        //定义个数组
        int[] arr = {1, 2, 3, 4, 5, 5};
        Random random = new Random();

        while (true) {
            //再用个循环遍历数组把里面元素打乱
            for (int i = 0; i < arr.length; i++) {
                //暂存变量
                int temp = arr[i];
                //i位置与随机索引的值交换
                int r = random.nextInt(arr.length);
                arr[i] = arr[r];
                arr[r] = temp;
            }

            /**
             * 一开始以为这样交换会使数组出现重复的值
             *
             * 调试完根本不会重复，因为每次赋值都是在交换，所以不会出现两个一样的值
             * 如果i==随机数，只是i位置的元素的值没有交换而已
             */
            //如果数组里有重复元素就打印这个数组
            if (cheakIsRepeat(arr)) {
                for (int e : arr) {
                    //没输出
                    System.out.print(e + " ");
                }
                break;
            }
        }
    }

    //判断数组是否有重复值
    public static boolean cheakIsRepeat(int[] array) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
        if (hashSet.size() == array.length) {
            //没有重复
            return false;
        } else {
            //重复
            return true;
        }
    }
}

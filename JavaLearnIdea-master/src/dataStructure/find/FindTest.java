package dataStructure.find;

import java.util.ArrayList;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.find
 * @className: FindTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-23 下午 12:13
 * @version: 1.0
 */
public class FindTest {
    /**
     * 几个基本查找算法
     * 顺序查找  遍历 可以是无序数据
     * 二分查找
     * 插值查找  二分对均匀数据的优化
     * 斐波那契查找  黄金分割分
     * 后俩本质也是二分，区别在于中值
     */
    public static void main(String[] args) {
//
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 10, 14, 15, 16, 17, 18, 19, 21, 22, 24, 25, 26};
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            for (int j = 0; j <30 ; j++) {
//                sqFind(arr1,j);
//            }
//        }
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            for (int j = 0; j <30 ; j++) {
//                binarySearch(arr1,j);
//            }
//        }
//        long end = System.currentTimeMillis();
//
//        System.out.println(start1-start);
//        System.out.println(end-start1);


        //利用FindTest2里的测试方法测试一下
        int num = 1000;

        int index = interFind(arr1, num);
        FindTest2.test(arr1, num, index);

        int indes2 = binarySearch(arr1, num);
        FindTest2.test(arr1, num, indes2);


        int index3 = sqFind(arr1, num);
        FindTest2.test(arr1, num, index3);

    }


    //插值查找，二分查找优化，适用于数据分布均匀，否则效率降低
    private static int interFind(int[] arr, int num) {
        //都是有序了
        //定义查找边界
        int min = 0;
        int max = arr.length - 1;
        //取中
        while (true) {
            if (min > max) return -1;
            int mid = min + (num - arr[min]) / (arr[max] - arr[min]) * (max - min);
            //数组索引越界
            if (mid > arr.length) {
                return -1;
            }

            if (arr[mid] < num) {
                min = mid + 1;
            } else if (arr[mid] > num) {
                max = mid - 1;
            } else return mid;
        }
    }

    //二分查找
    private static int binarySearch(int[] arr, int num) {

        //都是有序了
        //定义查找边界
        int min = 0;
        int max = arr.length - 1;
        //取中
        int mid = max / 2;

        //循环
        while (arr[mid] != num) {
            //没有的情况
            if (min > max) return -1;
            //目标值比中指大
            if (arr[mid] < num) {
                //更新小边界
                min = mid + 1;
                //更新中指
                mid = (max + min) / 2;
            } else if (arr[mid] > num) {// 目标值比中指小
                //更新大边界
                max = mid - 1;
                //更新中指
                mid = (max + min) / 2;
            } else return mid;//相等
        }
        return mid;
        /*
        的代码

         while (true) {
            if (min > max) return -1;
            int mid = (min + max) / 2;
            if (arr[mid] < num) {
                min = mid + 1;
            } else if (arr[mid] > num) {
                max = mid - 1;
            } else return mid;
        }

         */


    }


    //顺序查找
    private static int sqFind(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) return i;
        }
        return -1;
    }

    //利用顺序查找，查询数组某个元素的索引，考虑重复‘
    public static ArrayList<Integer> thisIndex(int[] arr, int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                list.add(i);
            }
        }
        return list;
    }


}

package dataStructure.sort;

import tool.arrays.MyTools;

import java.util.Arrays;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.sort
 * @className: SortTest1
 * @author: Kchenx
 * @description: 常见排序算法测试
 * @date: 2023-1-27 下午 7:27
 * @version: 1.0
 */
public class SortTest1 {
    /**
     * 常见排序算法有
     * 冒泡排序
     * 选择排序
     * 插入排序
     * 快速排序
     * 希尔排序
     * 没学的：
     * 归并排序
     * 堆排序
     * 计数排序
     * 桶排序
     * 基数排序
     */
    public static void main(String[] args) {


        //printArr(arr);

        int[] arr = MyTools.getRandomArray(new int[]{1, 2, 3, 4, 5});
        //showSortTime();
        System.out.println(Arrays.toString(arr));

        //冒泡排序
        //bubbleSort(arr);
        //选择排序
        //selectSort(arr);
        //插入排序
        // insSort(arr);
        //快速排序
        //quickSort(arr, 0, arr.length - 1);
        //希尔排序
        //shellSort(arr);



        //printArr(arr);


        //不知道是啥但是能用
        //whatSort(arr);


    }



    /**
     * 展示各个排序算法对长度2000的数组排序所用时间
     */
    private static void showSortTime() {
        /*
        40000条时希尔会比快速块
          数组大小           500    1000    1500     3000      5000       10000
        冒泡排序用时：        6ms    11ms    9ms      15ms      34ms       223ms
        选择排序用时：        3ms    6ms     12ms     18ms      44ms       278ms
        插入排序用时：        3ms    5ms     8ms      8ms       13ms       68ms
        快速排序用时：        1ms    1ms     1ms      1ms       1ms        4ms
        希尔排序用时：        0ms    0ms     2ms      2ms       3ms        7ms
        希尔排序二时：        0ms    1ms     2ms      2ms       2ms        5ms
         */

        int[] arr = MyTools.createIntArray(10000);
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        int[] arr4 = arr.clone();
        int[] arr5 = arr.clone();

        long time = System.currentTimeMillis();
        bubbleSort(arr);
        System.out.println("冒泡排序用时：" + (System.currentTimeMillis() - time) + "ms");

        long time1 = System.currentTimeMillis();
        selectSort(arr1);
        System.out.println("选择排序用时：" + (System.currentTimeMillis() - time1) + "ms");

        long time2 = System.currentTimeMillis();
        insSort(arr2);
        System.out.println("插入排序用时：" + (System.currentTimeMillis() - time2) + "ms");

        long time3 = System.currentTimeMillis();
        quickSort(arr3, 0, arr3.length - 1);
        System.out.println("快速排序用时：" + (System.currentTimeMillis() - time3) + "ms");

        long time4 = System.currentTimeMillis();
        shellSort(arr4);
        System.out.println("希尔排序用时：" + (System.currentTimeMillis() - time4) + "ms");

        long time5 = System.currentTimeMillis();
        ShellSort_move(arr5);
        System.out.println("希尔排序二时：" + (System.currentTimeMillis() - time5) + "ms");
    }

    private static void ShellSort_move(int[] arr){
        //增量的gap
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            int temp ;
            int j ;
            //从第gap个元素开始，逐个对其所在的组进行直接插入
            for(int i = gap ; i < arr.length ; i++){
                j = i;
                temp = arr[j];
                if(arr[j] < arr[j - gap]){
                    while (j - gap >= 0 && temp < arr[j - gap]){
                        //移动
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    //当退出while循环后，就给temp找到了插入位置
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 希尔排序（交换式） n^2
     * @param arr 目标数组
     */
    private static void shellSort(int[] arr) {
        /*
         希尔排序的时间复杂度分析及其复杂，有的增量序列的复杂度至今还没人能够证明出来，只需要记住结论就行，
         {1,2,4,8,...}这种序列并不是很好的增量序列，使用这个增量序列的时间复杂度(最坏情形)是O(n²)，
         Hibbard提出了另一个增量序列{1,3,7，...,2^k-1}，这种序列的时间复杂度(最坏情形)为O(n^1.5)，
         Sedgewick提出了几种增量序列，其最坏情形运行时间为O(n^1.3),其中最好的一个序列是{1,5,19,41,109,...}，
         需要一个临时变量用来交换数组内数据位置，所以空间复杂度为O(1)。
         */
        //分组后每组的增量gap  每次gap减半
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            //内部循环就是插入排序 有序开始位置gap
            for (int i = gap; i < arr.length; i++) {
                //插入循环，找合适的插入位置
                for (int j = i ; j >= gap; j = j - gap) {
                    //如果当前位置大于大于后一个位置的元素 交换
                    if (arr[j-gap] > arr[j]) {
                        int num = arr[j - gap];
                        arr[j - gap] = arr[j];
                        arr[j] = num;
                    }else break;
                }
            }
        }

    }

    /**
     * 快速排序 logn
     * @param arr 目标数组
     * @param i   开始索引
     * @param j   结束索引
     */
    private static void quickSort(int[] arr, int i, int j) {
        /*
        快速排序最好是O(nlogn),平均也是O(nlogn),最坏情况是序列本来就是有序的，此时时间复杂度为O(n²)，
        快速排序的空间复杂度可以理解为递归的深度，而递归的实现依靠栈，平均需要递归logn次，所以平均空间复杂度为O(logn)。
         */
        int start = i;
        int end = j;
        //递归结束条件
        if (start > end) {
            return;
        }
        //基准值
        int base = arr[i];
        //找基准值的位置，并按大于小于基准值排序
        while (start != end) {
            //切记！！！！ 基准值在左边，end先动！！！
            while (arr[end] >= base && end != start) {
                //如果小于基准值 或者 end与start指向同一位置了 跳出 等待start break
                end--;
            }

            while (true) {
                if (arr[start] > base || end == start) {
                    break;
                }
                start++;
            }
            //start也break后 交换位置
            int num = arr[start];
            arr[start] = arr[end];
            arr[end] = num;
        }
        //此时start与end指向同一位置，这个位置就是基准值要在的位置
        //交换他们
        int num = arr[start];
        arr[start] = arr[i];
        arr[i] = num;
        //递归  此时 start位置是基准值
        //左边 开始还是i 结束是基准值位置减一
        quickSort(arr, i, start - 1);
        //右边 结束还是j 开始是基准值加一
        quickSort(arr, start + 1, j);
    }


    /**
     * 插入排序 n~n^2
     * @param arr 目标数组
     */
    private static void insSort(int[] arr) {
        /*
        插入排序，如果序列是完全有序的，插入排序只要比较n次，无需移动时间复杂度为O(n)，
        如果序列是逆序的，插入排序要比较O(n²)和移动O(n²) ，所以平均复杂度为O(n²)，最好为O(n)，最坏为O(n²)，
        排序过程中只要一个辅助空间，所以空间复杂度O(1)。
         */
        //找到无序索引开始
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        //将无序部分，依次插到前面的有序部分
        for (int i = startIndex; i < arr.length; i++) {
            //插入循环，找合适的插入位置
            for (int j = i; j > 0; j--) { //直到放到0位置
                //如果j位置比前面小 就交换他们
                if (arr[j - 1] > arr[j]) {
                    int num = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = num;
                }else break;
            }
        }
    }

    private static void whatSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = 0; k < j; k++) {
                    if (arr[i] > arr[j]) {
                        int num = arr[i];
                        arr[i] = arr[j];
                        arr[j] = num;
                    } else break;
                }
            }
        }
    }

    /**
     * 选择排序 n^2
     * @param arr 目标数组
     */
    private static void selectSort(int[] arr) {
        /*
        选择排序是冒泡排序的改进，同样选择排序无论序列是怎样的都是要比较n(n-1)/2次的，
        最好、最坏、平均时间复杂度也都为O(n²)，需要一个临时变量用来交换数组内数据位置，所以空间复杂度为O(1)。
         */
        //外循环第一次从0开始 第二次从索引1开始 直到 倒数第二个索引
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环是比较 此次外循环开始位置(i) 与 每次循环的值(j)，把小的放到前面（开始位置-1(也就是外循环i的位置)）
            for (int j = i + 1; j < arr.length; j++) { //从i+1位置开始
                if (arr[j] < arr[i]) {
                    int num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
    }


    //冒泡排序

    /**
     * 冒泡排序 n^2
     * @param arr 目标数组
     */
    private static void bubbleSort(int[] arr) {
        /*
        1、时间复杂度都为O(n²)，需要一个临时变量用来交换数组内数据位置，所以空间复杂度为O(1)。
        优化：使用一个标志位来判断是否有序,若果有序，那么循环一次就直接退出，时间复杂度为O(n)
        */
        //外循环第一次遍历n次 第二次 n-1次 ...
        for (int j = arr.length; j > 1; j--) {
            //内循环判断大小并交换
            //从前两个开始，直到第J个  第一次是n个 第二次是n-1个 ...
            for (int i = 1; i < j; i++) { //每次把最大的推到数组最后
                if (arr[i - 1] > arr[i]) {
                    int num = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = num;
                }
            }
        }
    }

    /**
     * 遍历数组arr
     * @param arr
     */
    private static void printArr(int[] arr) {
        for (int a : arr
        ) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }


}

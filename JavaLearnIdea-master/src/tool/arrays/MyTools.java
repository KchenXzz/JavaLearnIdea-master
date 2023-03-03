package tool.arrays;

import dataStructure.queue.sqQueue.MyQueue;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @projectName: JavaLearnIdea
 * @package: tool.arrays
 * @className: MyArraysTool
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-2 上午 10:31
 * @version: 1.0
 */
public class MyTools {


    private MyTools() {
    }

    /**
     * 将元素批量添加到集合list
     *
     * @param list 要添加到的集合
     * @param t    添加的元素
     */

    @SafeVarargs
    public static <T> void addAllForList(List<T> list, T... t) {
        list.addAll(Arrays.asList(t));
    }

    @SafeVarargs
    public static <T> void addAllForList(MyQueue<T> list, T... t) {
        for (T t1 : t) {
            list.add(t1);
        }
    }


    public static int[] createIntArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arr.length);
        }
        return arr;
    }

    public static int[] createSqIntArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static String[] creatStringArray(int length) {
        Random random = new Random();
       String[] strings=new String[length];
        //利用阿斯克码表   33~122  ！~ z  89
        for (int i = 0; i < length; i++) {
            StringBuilder strB=new StringBuilder();
            char ch = (char) (random.nextInt(90) + 33);
            strB.append(ch);
            strings[i]=strB.toString();
        }
        return strings;
    }

    public static boolean isRepeat(int[] arr){
        for (int i : arr) {
            int count=0;
            for (int i1 : arr) {
                if (i1==i){
                    count++;
                }
                if(count==2){
                    return true;
                }
            }
        }
        return false;
    }













    public static int[] getRandomArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            //暂存变量
            int temp = arr[i];
            //i位置与随机索引的值交换
            int r = random.nextInt(arr.length);
            arr[i] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }
}










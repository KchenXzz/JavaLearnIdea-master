package test.arraysAPI;

import tool.arrays.MyTools;

import java.util.Arrays;

/**
 * @projectName: JavaLearnIdea
 * @package: test.arraysAPI
 * @className: ArraysTest
 * @author: Kchenx
 * @description: arrays类的学习
 * @date: 2023-1-30 下午 2:15
 * @version: 1.0
 */
public class ArraysTest {

    public static void main(String[] args) {

        int[] arr = MyTools.createIntArray(10);
        int[] arr1 = arr.clone();
        arr1[9]=12;
        arr1[8]=-arr[8];
        System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.compare(arr,arr1));
        System.out.println(Arrays.compare(arr,0,8,arr1,0,8));
        //System.out.println(Arrays.compareUnsigned(arr, arr1));
        int[]  arr2 = Arrays.copyOf(arr, 15);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOfRange(arr, 1, 3);//截取数组
        System.out.println(Arrays.toString(arr3));
        Arrays.fill(arr3,4);
        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.mismatch(arr, arr2));

        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));



    }



        }

package dataStructure.find;

import java.util.ArrayList;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.find
 * @className: FindTest2
 * @author: Kchenx
 * @description: 分块查找
 * @date: 2023-1-25 下午 7:39
 * @version: 1.0
 */
public class FindTest2 {
    /**
     * 分块查找
     * 块内无序，块间有序 块类 max startindex endindex
     * 分块一般分 元素个数开根号个块
     * 先确定目标在哪个块，--->可以用顺序，二分等查找方法
     * 然后再在块内查找 ---->可以用顺序，二分等查找方法
     * 拓展
     * 拓展的分块查找 （处理无规律数据）   未实现
     * 可以将块类的数据字段变成 max min startindex endindex   增加个min字段
     * 不同块之间不能有交集！
     * ！
     * 重点在于分块
     */
    public static void main(String[] args) {
        //分四块，但是可以分均匀，分三块
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};


        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //目标值
        int num = 67;
        //通过分块查到的索引
        int index = find(17, arr, b1, b2, b3);
        //测试方法
        test(arr, num, index);

    }

    //对数组查找算法的测试方法，返回true说明查找算法没问题
    //需要传入 数组，目标值，算法返回的索引
    public static void test(int[] arr, int num, int index) {
        try {
            System.out.println(arr[index] == num);
        } catch (ArrayIndexOutOfBoundsException e) {
            for (int a = 0; a< arr.length; a++) {
                if(arr[a]== num){
                    System.out.println(false);
                }else if(a== arr.length-1){
                    System.out.println(true);
                }
            }
        }
    }

    private static int find(int num, int[] arr, Block b1, Block b2, Block b3) {

        ArrayList<Block> blocks = new ArrayList<>();
        blocks.add(b1);
        blocks.add(b2);
        blocks.add(b3);

        for (Block b : blocks) {
            //
            int max = b.getMax();
            if (num <= max) {
                for (int j = b.getStartIndex(); j <= b.getEndIndex(); j++) {
                    if (arr[j] == num) {
                        return j;
                    }
                }

            }
        }
        return -1;
    }


}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
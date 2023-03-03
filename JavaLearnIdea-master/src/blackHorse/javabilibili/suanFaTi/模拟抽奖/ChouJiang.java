package blackHorse.javabilibili.suanFaTi.模拟抽奖;

import tool.arrays.MyTools;

public class ChouJiang {
    public static void main(String[] args) {
        /**
         *  实现抽奖
         * 例如一个红包里有[2,50,100,500,1000]五个奖项，抽中哪个随机不重复
         * 抽一次打印：xx元被抽中
         */
        //定义个数组存[2,50,100,500,1000]五个奖项
        //生成随机数
        //抽奖方法一
        //数组实现
        //就是用随机索引取数组里的元素，将被抽到的元素值变成0
        //实现不重复，抽之前判断，如果被抽中的位置的元素为0，重抽
        //奖项如果很多，抽到后面出现重复奖项的可能性越来越大，接近1,复杂度太大，不合理

        //方法2
        //线性表实现
        //被抽到的元素直接删除
        //这样就不会出现重复，复杂度在于线性表本身的删除和查找的复杂度

        //方法3
        //打乱奖池，然后再遍历奖池

        //奖池
        int[] award = {2, 50, 100, 500, 1000};
        //打乱

        int[] arr = MyTools.getRandomArray(award);
        //遍历打乱的数组
        for (int i : arr) {
            System.out.println(i + "元被抽出");
        }
    }

}

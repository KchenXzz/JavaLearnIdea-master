package blackHorse.javabilibili.suanFaTi.二维数组;

public class Test {
    public static void main(String[] args) {
        /**
         * 用二维数组计算季度营业额和全年营业额
         *
         * 一季度 234,334,533
         * 二季度 487,224,838
         * 三季度 182,384,433
         * 四季度 382,614,243
         *
         */
        //二维数组存数据
        int[][] towarr = {
                {234, 334, 533},
                {487, 224, 838},
                {182, 384, 433},
                {382, 614, 243}
        };
        int yearsum = 0;
        for (int i = 0; i < towarr.length; i++) {
            int sum = getSum(towarr[i]);
            System.out.println("第" + (i + 1) + "季度的营业额为" + sum);
            yearsum = yearsum + sum;
        }
        System.out.println("全年的营业额为" + yearsum);

    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }
}

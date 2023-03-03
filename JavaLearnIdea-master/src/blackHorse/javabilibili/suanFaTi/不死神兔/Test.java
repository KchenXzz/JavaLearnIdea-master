package blackHorse.javabilibili.suanFaTi.不死神兔;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.不死神兔
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-31 下午 5:31
 * @version: 1.0
 */
public class Test {
    /**
     * 有一对兔子
     * 从出生后第三个月起，每个月都生一对兔子
     * 小兔子长到第三个月后每个月又生一对兔子
     * 假如兔子不死
     * 问
     * 第十二个月的兔子的对数有多少？
     * 规律： 月份  1  2  3  4  5  6  7  8  9  10
     *       对数  1  1  2  3  5  8  13 21
     * 后面月份是前面月份对数的和
     * 1=1+0
     * 2=1+1
     * 3=2+1
     * 用递归
     * ps 应该也可以用二叉树或者红黑树解
     */
    public static void main(String[] args) {
        //方法一 递归
        System.out.println(byRecursion(1));

        //方法二 数组
        System.out.println(byArray(1));


    }
    private static int byArray(int month){
        int[] pairs = new int[month];
        for (int i = 0; i < pairs.length; i++) {
            if(i==1||i==0){
                pairs[i]=1;
            }else pairs[i]=pairs[i-1]+pairs[i-2];
        }
        return pairs[month-1];
    }



    private static int byRecursion(int month){
        if(month==1||month==2){
            return 1;
        }
        return byRecursion(month-1)+ byRecursion(month-2);
    }


}

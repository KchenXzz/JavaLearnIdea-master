package blackHorse.javabilibili.suanFaTi.猴子吃桃;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.猴子吃桃
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-31 下午 6:05
 * @version: 1.0
 */
public class Test {
    /**
     * 猴子吃桃
     * 一天吃掉当前桃子数量的一半后再吃一个
     * 吃到第十天还剩一个
     * 求一开始多少个桃子
     */
    public static void main(String[] args) {

        System.out.println(getNum(1,10));

    }

    /**
     * 给出吃的天数和剩余桃子数，得到第一天有多少个桃子
     * @param num 桃子数
     * @param day 天数
     * @return 第一天的桃子数
     */
    private static int getNum(int num,int day){
        num=2*(num+1);
        day=day-1;
        if(day==1){
            return num;
        }
        return getNum(num,day);
    }
}

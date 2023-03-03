package blackHorse.javabilibili.suanFaTi.杨辉三角;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.杨辉三角
 * @className: Test
 * @author: Kchenx
 * @description: 未修正的
 * @date: 2023-1-30 下午 5:59
 * @version: 1.0
 */
public class Test {
    /*
    输出的三角形不是等腰三角形！
     */
    public static void main(String[] args){
        final int NMAX = 10;

        // 分配三角形数组
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // 填充三角形阵列
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {
                /*
                 * 计算二项式系数 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        // 打印三角形阵列
        for (int[] row : odds)
        {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}

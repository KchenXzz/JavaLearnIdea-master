package blackHorse.javabilibili.games.twoColorBall;

import java.util.Scanner;

import static blackHorse.javabilibili.games.twoColorBall.TwoColorBall.creatNum;
import static blackHorse.javabilibili.games.twoColorBall.TwoColorBall.whichWinning;

public class WinningEmulator {
    public static void main(String[] args) {
        /**
         * 双色球中奖模拟器
         * 看多少次能中奖
         *
         * 不会还有人指望彩票发家致富吧
         */
        //确定个中奖号码
        //直接固定一个号码，放数组里
        int[] win = {23, 3, 32, 11, 17, 24, 13};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要中的奖项");
        System.out.println("一等奖--> 1");
        System.out.println("二等奖--> 2");
        System.out.println("三等奖--> 3");
        System.out.println("四等奖--> 4");
        System.out.println("五等奖--> 5");
        System.out.println("六等奖--> 6");
        System.out.println("不中奖--> 0");
        int n = sc.nextInt();
        int i = 1;
        while (true) {
            //程序生成号码
            int[] num = creatNum();
            //如果一等奖跳出
            if (whichWinning(num, win) == n) {
                //输出次数
                System.out.println("买了" + i + "次中奖");
                break;
            }
            i++;
        }

    }
}

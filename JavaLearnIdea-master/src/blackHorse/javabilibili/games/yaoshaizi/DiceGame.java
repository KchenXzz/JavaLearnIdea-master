package blackHorse.javabilibili.games.yaoshaizi;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        //实现摇骰子
        //摇一下筛子
        //摇
        //猜
        //判断
        //创建一个骰子对象
        ShaiZi n=new ShaiZi();
        Scanner sc=new Scanner(System.in);
        //记录猜的次数
        int i=0;
        //记录猜错的次数
        int e=0;
        show();
        while (true){
            //捕获键盘输入
            int x=sc.nextInt();
            //输入0直接退出
            if(x==0) break;
            else switch (x) {
                case 1 -> {
                    n.yaoShaizi();
                    System.out.println("摇了一下骰子");
                    //System.out.println("悄悄告诉你当前点数是"+n.getDianshu());
                    System.out.println("继续摇输入1，输入2开始猜点数");
                }
                case 2 -> {
                    System.out.println("输入猜的点数");
                    //键盘输入
                    x = sc.nextInt();
                    i++;
                    if (x == n.getDianshu()) {
                        if (i == 1) {
                            System.out.println("一猜就中！");
                        } else {
                            System.out.println("猜对了");
                        }
                        System.out.println("点数是" + n.getDianshu());
                        //更新骰子和记录错误的次数
                        n.yaoShaizi();
                        e = 0;
                    } else {
                        System.out.println("猜错了");
                        //错误次数记录
                        e++;
                        //错误次数到三次输出
                        if (e > 2) {
                            System.out.println("你已经猜错了" + e + "次");
                        }
                    }
                    show();
                }
                //跳出
                default -> System.out.println("----输入有误，重新输入----");
            }
        }
    }
    //主界面
    private static void show(){
        System.out.println("-------输入1摇骰子--------");
        System.out.println("-------输入2猜点数--------");
        System.out.println("-------输入0退出---------");
    }
}

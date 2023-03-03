
package blackHorse.javabilibili.games.yaoshaizi;

import java.util.Scanner;

public class YaoShaiZi {
    public static void main(String[] args) {
        //实现摇骰子
        //摇一下筛子
        //摇
        //猜
        //判断
        Scanner sc=new Scanner(System.in);
        //创建一个骰子对象
        ShaiZi n=new ShaiZi();
        //捕获键盘输入
        int x;
        System.out.println("输入1摇骰子");
        //用循环来实现摇骰子
        while (true){
            x=sc.nextInt();
            //喜欢摇就一直摇
            if (x==1){
                n.yaoShaizi();
                System.out.println("摇了一下骰子");
                //System.out.println("悄悄告诉你当前点数是"+n.getDianshu());
                System.out.println("继续摇输入1，输入其他开始猜点数");
            }//摇腻了就break!
             else break;
        }
        //摇完了，开始猜
        System.out.println("输入猜的点数");
        int i=0;
        while (true){
            //键盘输入
            x=sc.nextInt();
            if(x==0){
                System.out.println("很可惜，点数是"+n.getDianshu());
                break;
            }
            //记录猜的次数
            i++;
            //判断猜没猜对
            if(x==n.getDianshu()){
                System.out.println("猜对了");
                System.out.println("点数是"+n.getDianshu());
                //跳出
                break;
            }else {
                System.out.println("猜错了");
                //次数到三次输出
                if(i>2) {
                    System.out.println("你已经猜错了" + i + "次");
                }
                System.out.println("输入猜的点数（0退出）");
            }
        }
    }
}
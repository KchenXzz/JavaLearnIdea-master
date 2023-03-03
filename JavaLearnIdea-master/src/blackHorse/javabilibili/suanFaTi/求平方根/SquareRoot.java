package blackHorse.javabilibili.suanFaTi.求平方根;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        //给定一个数，求他的平方根，如果是小数，保留整数部分
        //
        System.out.println("请输入要判断的数：");
        Scanner sc=new Scanner(System.in);
        //定义一个Int数
        int x=sc.nextInt();

        for (int i = 1; i <=x; i++) {
            if(i*i==x){
                System.out.println(i);
                break;
            }else if (i*i>x){
                System.out.println(i-1);
                break;
            }
        }

    }
}

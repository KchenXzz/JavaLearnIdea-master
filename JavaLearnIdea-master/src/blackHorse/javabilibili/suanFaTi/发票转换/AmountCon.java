package blackHorse.javabilibili.suanFaTi.发票转换;

import java.util.Scanner;

public class AmountCon {
    /**
     * 金额转换
     * 将输入的数字转换为
     * x佰x拾x万x仟x佰x拾x元
     * 0  1  2  3  4  5  6  7  8  9
     * 零 壹 贰 叁 肆 伍 陆 柒 佰 玖
     */
    public static void main(String[] args) {

        //屏幕输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额（最大七位数）");
        int amount = 0;
        while (true) {
            amount = scanner.nextInt();
            if (amount >= 0 && amount <= 9999999) {
                break;
            } else System.out.println("输入有误，请重新输入");
        }
        //把amount里的数字一位位的取出,放到数组里
        //发票金额为七位
        int[] amountArr = new int[7];
        //从低位到高位取值,放到数组里
        for (int i = 0; amount > 0; i++) {
            amountArr[i] = amount % 10;
            amount = amount / 10;
        }
        //下面用得到的数组操作
        //遍历数组
        //用switch语句判断0~9
        //定义个字符串，结合StringBuilder()构建我们想要的字符串
        StringBuilder str = new StringBuilder();
        String results;

        //字符串的最开始是金额的高位
        //所以倒着遍历数组
        for (int i = amountArr.length - 1; i >= 0; i--) {
            //依次选择放入的字符，先放入金额的大写值，再放入位的大写值
            switch (amountArr[i]) {
                //大写值与数组元素0~9对应
                case 0:
                    str.append("零");
                    break;
                case 1:
                    str.append("壹");
                    break;
                case 2:
                    str.append("贰");
                    break;
                case 3:
                    str.append("叁");
                    break;
                case 4:
                    str.append("肆");
                    break;
                case 5:
                    str.append("伍");
                    break;
                case 6:
                    str.append("陆");
                    break;
                case 7:
                    str.append("柒");
                    break;
                case 8:
                    str.append("捌");
                    break;
                case 9:
                    str.append("就");
                    break;
            }
            //放入位的大写值
            switch (i) {
                //金额位大写值从高位到低位
                //i是依次由6~0
                case 0:
                    str.append("元");
                    break;
                case 1:
                    str.append("拾");
                    break;
                case 2:
                    str.append("佰");
                    break;
                case 3:
                    str.append("仟");
                    break;
                case 4:
                    str.append("万");
                    break;
                case 5:
                    str.append("拾");
                    break;
                case 6:
                    str.append("佰");
                    break;
            }
        }
        //构造成字符串
        results = str.toString();
        System.out.println("大写金额为："+results);



    }
}

package blackHorse.javabilibili.suanFaTi.输入字符判断;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * 屏幕输入字符串
         * 然后分别给出字符串中大小写字母和数字出现的次数
         */
        //屏幕输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        //对字符串判断
        //用string.charAt方法遍历字符串
        //结合ascll码判断
        //48~57--->0~9
        //65~90--->A~Z
        //97~122-->a~z
        /**
         * char类型会自动查询ASCII码表进行转换
         * char参与运算会自动转换成int
         * 也就是if (val >= 48 && val <= 57)
         * 等价于if (val >= '0' && val <= '9')
         * 下面的if语句改了一半
         *
         * ps:字符串用单引号’‘
         */
        /*String s="0123456789";
        String s1="abcxyz";
        for (int i = 0; i < s1.length(); i++) {
            System.out.println((int) s1.charAt(i));
        }
        */
        //分别记录数字大写字母小写字母出现的次数
        int num = 0;
        int big = 0;
        int small = 0;
        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //判断
            char val =  str.charAt(i);
            if (val >= '0' && val <= 57)
                num++;
            else {
                if (val >= 'A' && val <= 90)
                    big++;
                else {
                    if (val >= 'a' && val <= 122)
                        small++;
                }
            }
        }
        System.out.println("输入的是 "+str);
        System.out.println("一共输入的字符有"+str.length()+"个");
        System.out.println("输入的数字有"+num+"个");
        System.out.println("输入的大写字母有"+big+"个");
        System.out.println("输入的小写字母有"+small+"个");

    }




}


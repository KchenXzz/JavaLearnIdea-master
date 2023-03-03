package blackHorse.javabilibili.suanFaTi.实现parseInt;

import java.util.Scanner;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.字符串转数字
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-20 下午 8:38
 * @version: 1.0
 */
public class Test {
    /**
     * 自定义实现parseInt 效果
     * 将字符串型的数字转int
     * 不能是0开头
     * 最少一位
     * 最多十位
     *
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("""
                请输入一串数字\s
                * 不能是0开头
                * 最少一位
                * 最多十位""");
        String s="";
        while (true) {

            s = sc.nextLine();

            //格式校验
            String regex = "[1-9]\\d{0,9}";
            if (!s.matches(regex)) {
                System.out.println("格式错误,重新输入！");
            } else {
                System.out.println("格式正确！");
                break;
            }

        }
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            //最开始是用的Switch判断是那个数字
            //这是更好的方法，直接减'0'，得到int型相应数字
            num=s.charAt(i)-'0'+num*10;
            System.out.println(num);
        }
        System.out.println("转为int："+num);


    }

    private static int getBySwitch(String s, int num, int i) {
        char charAtr = s.charAt(i);
        switch (charAtr) {
            case 48 -> num = num * 10;
            case 49 -> num = 1+ num *10;
            case 50 -> num = 2+ num *10;
            case 51 -> num = 3+ num *10;
            case 52 -> num = 4+ num *10;
            case 53 -> num = 5+ num *10;
            case 54 -> num = 6+ num *10;
            case 55 -> num = 7+ num *10;
            case 56 -> num = 8+ num *10;
            case 57 -> num = 9+ num *10;
        }
        return num;
    }

    private static void getInt(String s) {


    }


}

package test.dateAndTime;

import blackHorse.javabilibili.suanFaTi.求素数.Prime;

import java.util.Date;
import java.util.Random;

/**
 * @projectName: JavaLearnIdea
 * @package: test.date
 * @className: DateTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/13 11:43
 * @version: 1.0
 */
public class DateTest {
    public static void main(String[] args) {
        isBeforeTest();


    }

    private static void isBeforeTest() {
        Random random=new Random();
        Date date1 = new Date(Math.abs(random.nextInt())*1000L);
        Date date2= new Date(Math.abs(random.nextInt())*1000L);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(isBefore(date1, date2));
    }

    private static void timeQiShi() {
        Date date2 = new Date(0L);
        System.out.println("计算机时间起始" + date2);
        date2.setTime(1000);//1000毫秒
        System.out.println("   +1000毫秒 " + date2);
    }

    private static void dateTest1() {
        Date date = new Date();
        System.out.println(date);

        System.out.println("求素数中");
        for (int i = 1; i <= 100000; i++) {
            if (Prime.isPrime(i)) {
            }
        }
        System.out.println("求素数结束");

        //上面求素数大概一秒
        System.out.println();
        long time = System.currentTimeMillis();
        Date date1 = new Date(time);
        System.out.println(date1);
        System.out.println("当前时间毫秒值" + date1.getTime());
    }

    private static void nextYear() {
        System.out.println("打印时间原点一年后的时间");
        Date date = new Date(0);
        System.out.println(date);
        long year = 365L * 24 * 60 * 60 * 1000;
        date.setTime(year);
        System.out.println(date);
    }

    private static boolean isBefore(Date date1, Date date2) {
        if (date1.getTime() < date2.getTime()) {
            return true;
        } else return false;
    }
}

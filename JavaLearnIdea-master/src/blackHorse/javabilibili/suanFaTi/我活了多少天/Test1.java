package blackHorse.javabilibili.suanFaTi.我活了多少天;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.我活了多少天
 * @className: Test1
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-21 下午 5:40
 * @version: 1.0
 */
public class Test1 {
    /**
     * 利用日期类 计算我活了多少天
     *
     */
    public static void main(String[] args) {
        //showTime();

        byJDK8();
        //byJDK7();

    }

    private static void showTime() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            byJDK8();
        }
        long end1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            byJDK7();
        }
        long end = System.currentTimeMillis();

        System.out.println(end1-start);
        System.out.println(end-end1);
    }

    private static void byJDK7() {
        //日历类
        Calendar birthday = Calendar.getInstance();
        birthday.set(2000,Calendar.DECEMBER,15);
        //转long型毫秒值
        long l = birthday.getTimeInMillis();
        long days = System.currentTimeMillis() - l;
        System.out.println(days/(24 * 60 * 60 * 1000)+"天");
    }

    private static void byJDK8() {
        //生日
        LocalDate birthday=LocalDate.of(2000,12,15);
        //现在日期
        LocalDate now = LocalDate.now();
        long days = now.toEpochDay() - birthday.toEpochDay();
        System.out.println(days+"天");
    }


}

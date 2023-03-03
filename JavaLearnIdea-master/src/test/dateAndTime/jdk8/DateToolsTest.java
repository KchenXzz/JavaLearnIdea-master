package test.dateAndTime.jdk8;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @projectName: JavaLearnIdea
 * @package: test.dateAndTime.jdk8
 * @className: DateTools
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/14 18:23
 * @version: 1.0
 */
public class DateToolsTest {
    public static void main(String[] args) {
        //jdk8新增的工具类
        //三个时间间隔类
//        Duration   秒 纳秒
//        Period     年 月 日
//        ChronoUnit 所有单位 这个类并不能直接使用 只是给上面两个提供单位

        //test
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 12, 15);

        Period between = Period.between(birthday, today);
        System.out.println(between);
        System.out.println(between.getDays());
        System.out.println(between.getMonths());
        System.out.println(between.getYears());
        System.out.println(between.toTotalMonths());
        System.out.println(between.get(ChronoUnit.DAYS));



    }
}

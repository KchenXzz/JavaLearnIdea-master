package test.dateAndTime.jdk8;

import java.time.Instant;
import java.time.ZoneId;

/**
 * @projectName: JavaLearnIdea
 * @package: test.date.jdk8
 * @className: InstantTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/14 17:10
 * @version: 1.0
 */
public class InstantTest {
    public static void main(String[] args) {

//        获取当前时间戳
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);


        //可以设置任意时间
        Instant instant1 = Instant.ofEpochSecond(1000L);//秒
        Instant instant2 = Instant.ofEpochMilli(1000L);//纳秒


        //还有判断时间先后的方法
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant1.isAfter(instant2));
        System.out.println(instant1.isBefore(instant2));

        //时区
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        System.out.println(nowInstant.atZone(zoneId));


        //时间增加减少
        Instant instant3 = instant1.minusSeconds(100L);
        Instant instant4 = instant1.plusSeconds(100L);
        Instant instant5 = instant1.minusMillis(100L);
        Instant instant6 = instant1.minusNanos(100L);









    }


}

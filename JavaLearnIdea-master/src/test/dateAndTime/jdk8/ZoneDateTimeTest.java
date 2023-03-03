package test.dateAndTime.jdk8;

import java.time.ZonedDateTime;

/**
 * @projectName: JavaLearnIdea
 * @package: test.date.jdk8
 * @className: ZoneDateTimeTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/14 17:42
 * @version: 1.0
 */
public class ZoneDateTimeTest {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //获取指定事件对象 .ofXXX
        //减少增加同样是minusXXX  plusXXX
        //修改时间 withXXX
        ZonedDateTime withHour = now.withHour(22);
        System.out.println(withHour);


    }
}

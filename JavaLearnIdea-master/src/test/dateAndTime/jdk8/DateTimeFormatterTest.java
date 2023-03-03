package test.dateAndTime.jdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @projectName: JavaLearnIdea
 * @package: test.date.jdk8
 * @className: DateTimeFormatterTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/14 17:48
 * @version: 1.0
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //获取时间对象
        ZonedDateTime date1 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        //时间格式化解析器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 ahh点mm分");
        //让他去解析date1
        System.out.println(dtf.format(date1));

    }
}

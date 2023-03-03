package test.dateAndTime.jdk8;

import java.time.ZoneId;
import java.util.Set;

/**
 * @projectName: JavaLearnIdea
 * @package: test.date.jdk8
 * @className: ZoneIdTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/14 17:03
 * @version: 1.0
 */
public class ZoneIdTest {
    public static void main(String[] args) {

//        ZoneId 时区
        //得到所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        System.out.println(zoneIds.size());

        //获取系统时区
        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println(systemZoneId);

        ZoneId zoneId = ZoneId.of("Europe/London");
        System.out.println(zoneId);


    }
}

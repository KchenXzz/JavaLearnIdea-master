package test.dateAndTime.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @projectName: JavaLearnIdea
 * @package: test.date
 * @className: LocalDateTimeTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/14 16:46
 * @version: 1.0
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        //        LocalDate LocalTime LocalDateTime
        //        日期       时间       日期和时间
        //方法和Calender差不多 挺多
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDateTime time1 = LocalDateTime.of(2023, 1, 1, 5, 20);
        System.out.println(time1);


        System.out.println(time1.getMonth());//JANUARY
        System.out.println(time1.getMonthValue());//1


        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 12, 15);
        LocalDate birthday1 = LocalDate.of(2022, 12, 15);

        System.out.println(isBirthday(today,birthday));


    }

    private static void formatter(LocalDateTime time1) {
        //同样可以被DateTimeFormatter按指定格式解析
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 ahh点mm分");
        System.out.println(dateTimeFormatter.format(time1));
    }

    //判断今天是不是生日
    private static boolean isBirthday(LocalDate today, LocalDate birthday){
        Month todayMonth = today.getMonth();
        Month birthdayMonth = birthday.getMonth();
        return todayMonth.equals(birthdayMonth);
    }
}

package test.dateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @projectName: JavaLearnIdea
 * @package: test.date
 * @className: SimpleDateFormatTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/13 12:27
 * @version: 1.0
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {

        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 ahh点mm分");
        System.out.println(sdf.format(date1));

    }

    private static void zhuanHuan() throws ParseException {
        //将2000-12-12转换为2000年12月12日
        String s1 = "2000-12-12";
        String r1 = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(r1);
        Date date = sdf.parse(s1);
        SimpleDateFormat newsmf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(newsmf.format(date));
    }

    private static void test() throws ParseException {
        String regex="YYYY年MM月DD日hh点mm分ss秒 E";
        Pattern pattern = Pattern.compile(regex);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern.pattern());
        System.out.println(simpleDateFormat.format(new Date()));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        System.out.println(simpleDateFormat1.format(new Date()));
        SimpleDateFormat sdf = new SimpleDateFormat(regex);
        Date date = sdf.parse("2023年1月1日8点23分19秒 周一");//如果星期与日期对不上会按星期
        System.out.println(date);
    }
}

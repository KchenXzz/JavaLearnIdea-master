package test.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @projectName: JavaLearnIdea
 * @package: test.date
 * @className: GalendarTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/14 10:03
 * @version: 1.0
 */
public class CalendarTest {
    public static void main(String[] args) {
        //抽象类，不知直接实例化，用静态方法
        Calendar calendar = Calendar.getInstance();
        //calendar的数据在数组里
        //输出后显示
        //month  0~11  星期从周末开始
        System.out.println(calendar.get(Calendar.MONTH)+1);


        int index=calendar.get(Calendar.DAY_OF_WEEK);
        //星期？
        System.out.println(getWeek(index));


    }


    private static String getWeek(int index){
        String[] weeks={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return weeks[index];

    }
    private static void used(Calendar calendar) {
        Date date = calendar.getTime();
        System.out.println(date);

        calendar.setTime(new Date(1000000000000000L));

        String pan = "yyyy年MM月dd日 ahh点mm分";
        Pattern pattern = Pattern.compile(pan);
        SimpleDateFormat format = new SimpleDateFormat(pan);
        String s = format.format(date);
        System.out.println(s);
    }

    private static void thisGet(Calendar calendar){
        //Index 17 out of bounds for length 17
        for (int i = 0; i < 17; i++) {
            System.out.println(calendar.get(i));
        }




    }
}

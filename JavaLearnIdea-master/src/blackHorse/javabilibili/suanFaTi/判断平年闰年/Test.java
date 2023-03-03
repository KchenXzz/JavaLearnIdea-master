package blackHorse.javabilibili.suanFaTi.判断平年闰年;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.判断平年闰年
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-22 下午 4:18
 * @version: 1.0
 */
public class Test {
    /**
     * 判断这一年是平年还是闰年
     * 用JDK7和JDK8判断
     * 平年28天、闰年29天
     */
    public static void main(String[] args) {
        //屏幕录入
        Scanner scanner=new Scanner(System.in);

        String year=scanner.nextLine();
        //合法性判断？

        

        while ( !year.matches("[1-9]\\d*")){
            System.out.println("格式错误");
            year=scanner.nextLine();

        }
        int num = Integer.parseInt(year);

        byJDK7(num);
        byJDK8(num);


    }

    private static void byJDK8(int num) {
        LocalDate date = LocalDate.of(num, 3, 1);
        LocalDate date1 = date.minusDays(1);
        isToDisplay(date1.getDayOfMonth());
    }

    private static void byJDK7(int year) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,Calendar.MARCH,1);
        calendar.add(Calendar.DAY_OF_YEAR,-1);
        isToDisplay(calendar.get(Calendar.DAY_OF_MONTH));

    }
    private static void isToDisplay(int dayOfMonth){
        if(dayOfMonth==29){
            System.out.println("闰年");
        }else System.out.println("平年");




    }


}

package test.integer;

/**
 * @projectName: JavaLearnIdea
 * @package: test.integer
 * @className: IntegerTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-19 下午 8:37
 * @version: 1.0
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer integer = 100;
        int i8 = Integer.parseInt("123", 8);
        System.out.println(i8);

        int i10=100;
        System.out.printf("%d\n",i10);
        //相加自动将八进制转十进制后再相加
        System.out.println(i10+i8);
        System.out.printf("%o\n",i8);
        System.out.println(Integer.toHexString(i8));
        System.out.println(Integer.toOctalString(i8));
        System.out.println(Integer.toBinaryString(i8));


        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("false"));


    }
}

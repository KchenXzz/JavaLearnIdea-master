package test.bigNumber;

import java.math.BigInteger;
import java.util.Random;

/**
 * @projectName: JavaLearnIdea
 * @package: test.bigNumber
 * @className: BigIntegerTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/6 9:19
 * @version: 1.0
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(Math.pow(2, 100));

        //随机数范围（2^100）-1
        BigInteger bigInteger1 = new BigInteger(100, random);
        System.out.println(bigInteger1);

        //字符串转大数
        System.out.println(new BigInteger("12345678987654321"));

        //字符串转大数，按照指定进制，将二进制数转十进制输出
        System.out.println(new BigInteger("1010101001010", 2));

        //静态方法，形参是long类型不能超出
        //在-16~16做了优化，提前创建好了对象
        BigInteger bd=BigInteger.valueOf(123);
        System.out.println(bd);
        System.out.println(bd==BigInteger.valueOf(123));//false

        BigInteger bd1=BigInteger.valueOf(12);
        System.out.println(bd1);
        System.out.println(bd1==BigInteger.valueOf(12));//true

    }


}

package test.bigDecimal;

import java.math.BigDecimal;

/**
 * @projectName: JavaLearnIdea
 * @package: test.bigDecimal
 * @className: BigDecimalTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/6 10:29
 * @version: 1.0
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        //精度损失
        System.out.println(0.01+0.09);
        //主要用这两种，不会出现精度损失，精确

        //范围大
        BigDecimal bd1=new BigDecimal("0.01");
        BigDecimal bd2=new BigDecimal("0.09");
        System.out.println(bd2.add(bd1));

        //范围是double的范围
        //都是新创建对象
        BigDecimal bd3=BigDecimal.valueOf(0.01);
        BigDecimal bd4=BigDecimal.valueOf(0.09);
        System.out.println(bd3.add(bd4));

        //范围是double的范围
        //现成对象
        BigDecimal bd5=BigDecimal.valueOf(1);
        //新创建对象
        BigDecimal bd6=BigDecimal.valueOf(12);
        System.out.println(bd5.add(bd6));




    }
}

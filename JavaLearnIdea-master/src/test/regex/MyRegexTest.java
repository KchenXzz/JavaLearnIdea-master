package test.regex;

/**
 * @projectName: JavaLearnIdea
 * @package: test.regex
 * @className: MyRegexTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/8 9:52
 * @version: 1.0
 */
public class MyRegexTest {
    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        System.out.println(MyRegex.isNameLegal("wuhu"));
        System.out.println(MyRegex.isNameLegal("kongchenxing"));
        System.out.println(MyRegex.isNameLegal("wuhu_q"));
        System.out.println(MyRegex.isNameLegal("323_dfd"));
        System.out.println(MyRegex.isNameLegal("@323"));//false
        System.out.println(MyRegex.isNameLegal("323_d fd"));//false

        System.out.println("-----------------------------------");
        System.out.println(MyRegex.isIdLegal("37098320001215371X"));
        System.out.println(MyRegex.isIdLegal("370983200012153714"));
        System.out.println(MyRegex.isIdLegal("37098320000015371X"));
        System.out.println(MyRegex.isIdLegal("37098321001215371X"));

        System.out.println("-----------------------------------");
        System.out.println(MyRegex.isCarIdLegal("鲁J88888"));
        System.out.println(MyRegex.isCarIdLegal("LB28681"));
        System.out.println(MyRegex.isCarIdLegal("鲁999999"));

        System.out.println("-----------------------------------");
        System.out.println(MyRegex.isBankCardLegal("123456789012345678901234567890"));
        System.out.println(MyRegex.isBankCardLegal("1234567890123456789012345678901"));
        System.out.println(MyRegex.isBankCardLegal("1234567890"));
        System.out.println(MyRegex.isBankCardLegal("123456789"));


        System.out.println("-----------------------------------");
        System.out.println(MyRegex.isPasswordLegel("zx12Z*ss"));
        System.out.println(MyRegex.isPasswordLegel("zx12*ss"));
        System.out.println(MyRegex.isPasswordLegel("zx12Zss"));
        System.out.println(MyRegex.isPasswordLegel("1234567"));
        System.out.println(MyRegex.isPasswordLegel("x1Z*s"));


    }


}

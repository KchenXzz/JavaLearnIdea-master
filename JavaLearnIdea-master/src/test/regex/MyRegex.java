package test.regex;

/**
 * @projectName: JavaLearnIdea
 * @package: test.regex
 * @className: userNameRegex
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/8 9:37
 * @version: 1.0
 */
public class MyRegex {


    //用户名正则表达式，可以是四到十六位的字母数字下划线
    private final String name ="\\w{4,16}";

    //身份证简单校验
    //身份证号， 共十八位，前十七位是数字，最后一位可以是数字，或者大写或小写的X
    //也可以是"[1-9]\\d{16}(\\d|x|X)"
    //也可以是"[1-9]\\d{16}(\\d|(?i)x)"
    private final String IDcard1="[1-9]\\d{16}[\\dxX]";

    //身份证严格校验
    //370983  2000  1215  377 0
    /*
    （身份证号码第一位到第六位）公民身份号码是特征组合码，由十七位数字本体码和一位校验码组成。
    排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。
     */
    //六位数字地址码   第一位不能是0 后五位任意数字
    //八位数字出生日期码
    // 年 18 19 20 + 任意两位数字
    // 月 01~09 10 11 12
    // 日 01~31
    // 三位数字顺序码和一位数字校验码(数字或大写或小写X)

    private final String IDcard="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dxX]";

    //车牌号正则
    private final String carId="(?:[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领 A-Z]{1}[A-HJ-NP-Z]{1}(?:(?:[0-9]{5}[DF])|(?:[DF](?:[A-HJ-NP-Z0-9])[0-9]{4})))|(?:[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领 A-Z]{1}[A-Z]{1}[A-HJ-NP-Z0-9]{4}[A-HJ-NP-Z0-9 挂学警港澳]{1})";

    //银行卡正则
    private final String bankCard="[1-9]\\d{9,29}";

    //密码强度校验 至少六位，包含至少一个大写字母 小写字母 数字 特殊字符
    private final String password="\\S*(?=\\S{6,})(?=\\S*\\d)(?=\\S*[A-Z])(?=\\S*[a-z])(?=\\S*[!@#$%^&*? ])\\S*";



    private MyRegex() {
    }

    public static boolean isNameLegal(String name){
        MyRegex myRegex=new MyRegex();
        return name.matches(myRegex.name);
    }

    public static boolean isIdLegal(String IdCard){
        MyRegex myRegex=new MyRegex();
        return IdCard.matches(myRegex.IDcard);
    }


    public static boolean isCarIdLegal(String CarId){
        MyRegex myRegex=new MyRegex();
        return CarId.matches(myRegex.carId);
    }

    public static boolean isBankCardLegal(String bankCard){
        MyRegex myRegex=new MyRegex();
        return bankCard.matches(myRegex.bankCard);
    }


    public static boolean isPasswordLegel(String password){
        MyRegex myRegex=new MyRegex();
        return password.matches(myRegex.password);
    }



}


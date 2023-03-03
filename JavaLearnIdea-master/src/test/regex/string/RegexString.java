package test.regex.string;

/**
 * @projectName: JavaLearnIdea
 * @package: test.regex.string
 * @className: RegexString
 * @author: Kchenx
 * @description: 用正则表达式对字符串进行切割与替换
 * @date: 2023/1/11 17:14
 * @version: 1.0
 */
public class RegexString {
    public static void main(String[] args) {
//        用正则表达式对字符串进行切割与替换
//        切割
//        s.replaceAll(被替换的正则，要替换的内容)
//

        String str = "java目前版本有Java8和Java11还有Java17以及Java19等等 ";
        String str1 = "中文yingwen哈哈哈哈hahaha";

        String regex = "(?i)java\\d+";
        String regex1 = "(?i)java\\d+";
        String regex2 = "(?i)java\\d+";
        String newstr = str.replaceAll(regex, "python");


        System.out.println(newstr);
    }
}

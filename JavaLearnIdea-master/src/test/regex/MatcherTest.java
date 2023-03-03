package test.regex;

/**
 * @projectName: JavaLearnIdea
 * @package: test.regex
 * @className: MatcherTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/6 18:47
 * @version: 1.0
 */
public class MatcherTest {
    public static void main(String[] args) {
        System.out.println("------------一个方括号判断一位------------");
        System.out.println("\"az\".matches(\"[abc][wz]\")");
        System.out.println("az".matches("[abc][wz]"));
        System.out.println("-----------abc取反------------");
        System.out.println("b".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));
        System.out.println("-----------abc或d------------");
        System.out.println("d".matches("[abc||[d]]"));
        System.out.println("a".matches("[abc||[d]]"));
        System.out.println("-----------啥都行------------");
        System.out.println("d".matches("."));
        System.out.println(" ".matches("."));
        System.out.println("-".matches("."));
        System.out.println("_".matches("."));
        System.out.println(",".matches("."));

        System.out.println("-----------数字------------");
        System.out.println("4".matches("\\d"));
        System.out.println("4".matches("(\\d+)||[#]"));
        System.out.println("#".matches("(\\d+)||[#]"));
        System.out.println("44".matches("(\\d+)||[#]"));
        System.out.println("3a".matches("(\\d+)||[#]"));
        System.out.println("-----------忽略大小写---------");
        String regex="(?i)abc";//都忽略
        String regex1="a(?i)bc";//忽略bc
        String regex2="a((?i)b)c";//忽略b
        System.out.println("abc".matches(regex));
        System.out.println("ABC".matches(regex));
        System.out.println("aBc".matches(regex));
        System.out.println("aBc".matches(regex1));
        System.out.println("ABc".matches(regex1));
        System.out.println("aBc".matches(regex2));
        System.out.println("ABc".matches(regex2));
        System.out.println("aBC".matches(regex2));



    }
}

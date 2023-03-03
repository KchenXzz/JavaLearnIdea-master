package test.regex.fenzu;

/**
 * @projectName: JavaLearnIdea
 * @package: test.regex.fenzu
 * @className: Test1
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/13 10:25
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //捕获分组 后面可以使用\\1 \\2 $1 等等
        //非捕获分组 后面不可以使用\\1 \\2 $1 ， 不占用组号


        //判断开始自字符与结束字符是否一致，考虑一个字符
        String regex1 = "(.).+\\1";
        System.out.println("a324a".matches(regex1));
        System.out.println("&324&".matches(regex1));
        System.out.println("a324aa".matches(regex1));


        //判断开始自字符与结束字符是否一致，考虑多个字符
        System.out.println("----------------------------");
        String regex2 = "(.+).+\\1";
        System.out.println("ab324ab".matches(regex2));
        System.out.println("&a324&".matches(regex2));
        System.out.println("12321".matches(regex2));


        //判断开始自字符与结束字符是否一致，考虑多个字符
        System.out.println("----------------------------");
        String regex3 = "((.)\\1*).+\\2";//* 出现0次或多次
        System.out.println("aa324aa".matches(regex3));
        System.out.println("aab324aab".matches(regex3));
        System.out.println("11123211".matches(regex3));




    }
}

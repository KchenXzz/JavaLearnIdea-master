package test.regex.fenzu;

/**
 * @projectName: JavaLearnIdea
 * @package: test.regex.fenzu
 * @className: ChongFuTiH
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/13 11:24
 * @version: 1.0
 */
public class ChongFuTiH {
    public static void main(String[] args) {

        String str = "我我我我是是是是个个个个个个个结结结结巴巴巴巴";
        //替换为 我是个结巴

        String regex1 = "(.)\\1+";
        String newStr = str.replaceAll(regex1, "$1");
        System.out.println(newStr);
        String newStr1 = str.replaceAll(regex1, "重");
        System.out.println(newStr1);

    }
}

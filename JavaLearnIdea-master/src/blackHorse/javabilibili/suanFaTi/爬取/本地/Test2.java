package blackHorse.javabilibili.suanFaTi.爬取.本地;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.leetCode.爬取.本地
 * @className: Test2
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/11 15:07
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        String str="Java平台由Java虚拟机(Java Virtual Machine)和Java应用编程接口(Application Programming Interface、简称API)构成。" +
                "Java应用编程接口为Java应用提供了一个独立于操作系统的标准接口，可分为基本部分和扩展部分。" +
                "在硬件或操作系统平台上安装一个Java平台之后，Java应用程序就可运行。" +
                "Java平台已经嵌入了几乎所有的操作系统。这样Java程序可以只编译一次，就可以在各种系统中运行。" +
                "Java应用编程接口已经从1.1x版发展到1.2版。常用的Java平台基于Java1.8，最近版本为Java19。"+
                "java目前版本有Java8和Java11还有Java17以及Java19等等";

        String regex = "((?i)j)ava";
        String regex1 = "Java(?=8|11|17)";
        String regex2 = "Java(8|11|17)";

        Pattern pattern=Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

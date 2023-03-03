package blackHorse.javabilibili.suanFaTi.爬取.网络;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.leetCode.爬取.网络
 * @className: Test1
 * @author: Kchenx
 * @description: 爬取这页面上的古诗名及作者，但是没有解决长度不同导致多爬取后面的字符
 * @date: 2023/1/8 15:15
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://mp.weixin.qq.com/s?__biz=MjM5ODI2MTQxOQ==&mid=2653653630&idx=2&sn=376caa816a8edbacc288fa195fa4b4d1&chksm=bd124dba8a65c4acd84befebd56659415bb8bdf4153a26ece6289326b40c7a413e729f0e0343&scene=27");

        URLConnection connection = url.openConnection();

        BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;

        String regex = "((\\d{2}\\.)|(\\d\\.)|(\\d{3}\\.)).{20}";
        String regex1 = "《.{30}";

        Pattern pattern = Pattern.compile(regex1);

        while ((line = bf.readLine()) != null) {

            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                if(Objects.equals(matcher.group(), "<")) {
                    break;
                }else {
                    System.out.println(matcher.group());
                }
            }
        }


        bf.close();

    }
}

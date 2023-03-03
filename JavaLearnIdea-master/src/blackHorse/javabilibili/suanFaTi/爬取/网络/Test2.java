package blackHorse.javabilibili.suanFaTi.爬取.网络;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.leetCode.爬取.网络
 * @className: Test2
 * @author: Kchenx
 * @description: 网络爬取练习，爬取这页面上的手机号
 * @date: 2023/1/8 14:51
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://m.xuanhao.com/");

        URLConnection connection = url.openConnection();

        BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;

        String regex = "(?:(?:\\+|00)86)?1(?:(?:3[\\d])|(?:4[5-7|9])|(?:5[0-3|5-9])|(?:6[5-7])|(?:7[0-8])|(?:8[\\d])|(?:9[1|8|9]))\\d{8}";

        Pattern pattern = Pattern.compile(regex);
        while ((line = bf.readLine()) != null) {

            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }


        bf.close();

    }
}

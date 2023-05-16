package test.IO.paQuXingMing;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/5/16 17:28
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {

        //网址
        String url1 = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&device=pc&from=home";
        String url2 = "http://www.haoming8.cn/baobao/10881.html";
        String url3 = "http://www.haoming8.cn/baobao/7641.html";

        //爬取整个网址
        String name1 = wbCrawer(url1);
        String name2 = wbCrawer(url2);
        String name3 = wbCrawer(url3);
        //System.out.println(name1);

        //处理数据
        String regex1 = "(.{4})(，|。)";//姓氏正则
        String regex2 = "(.{2})(、|。)(.{2})(、|。)";//名字正则
        String regex3 = "(.{2})( )(.{2})( )(.{2})( )(.{2})( )(.{2})";//名字正则 彤舞 芊静 艾丝 惠蕙 语月

        //通过正则爬取姓氏
        ArrayList<String> name1List = getDate(regex1, name1, 1);
//        System.out.println(name1List);


        //通过正则爬取男生名字
        ArrayList<String> boyList = getDate2(regex2, name2, 1);
//        System.out.println(boyList);

        // 通过正则爬取女生名字
        ArrayList<String> girlList = getDate3(regex3, name3, 1);
//        System.out.println(girlList);

        writeData(name1List);
        writeData(boyList);
        writeData(girlList);


    }

    /**
     * 将集合写到文件
     * @param list 集合
     * @throws IOException
     */
    private static void writeData(ArrayList<String> list) throws IOException {

        //都写到这个文件
        File file = new File("JavaLearnIdea-master\\src\\test\\IO\\paQuXingMing\\name.txt");

        //可覆写
        FileWriter fileWriter = new FileWriter(file, true);

        //日期对象
        LocalDateTime dateTime = LocalDateTime.now();
        //指定日期格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 ahh点mm分");
        fileWriter.write(dateTimeFormatter.format(dateTime) +"\n");
        for (String s : list) {
            fileWriter.write(s);
        }

        fileWriter.write("\n");
        fileWriter.close();

    }


    /**
     * 提取网页的百家姓
     *
     * @param regex 正则
     * @param data  网页的字符串
     * @param index 正则下表
     * @return 保存百家姓的列表
     */
    private static ArrayList<String> getDate(String regex, String data, int index) {

        ArrayList<String> list = new ArrayList<>();

        //正则对象
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);//要处理的字符串
        //如果招到了
        while (matcher.find()) {
            //先保存字符串
            String s = matcher.group(index);
            //依次放到集合
            for (int i = 0; i < 4; i++) {
                list.add((s.substring(i, i + 1)));
            }
        }

        return list;
    }

    /**
     * 提取男生名字
     * @param regex 正则
     * @param data  网页的字符串
     * @param index 正则下表
     * @return 保存名字的列表
     */
    private static ArrayList<String> getDate2(String regex, String data, int index) {

        ArrayList<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {

            list.add(matcher.group(index));
            list.add(matcher.group(index + 2));
        }

        return list;
    }
    /**
     * 提取女生名字
     * @param regex 正则
     * @param data  网页的字符串
     * @param index 正则下表
     * @return 保存名字的列表
     */
    private static ArrayList<String> getDate3(String regex, String data, int index) {

        ArrayList<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        int i = index;
        while (matcher.find()) {
            index = i;
            list.add(matcher.group(index));
            index = index + 2;
            list.add(matcher.group(index));
            index = index + 2;
            list.add(matcher.group(index));
            index = index + 2;
            list.add(matcher.group(index));
            index = index + 2;
            list.add(matcher.group(index));

        }

        return list;
    }

    /**
     * 爬取网页
     *
     * @param url 网址
     * @return 返回整个网页
     * @throws IOException
     */
    private static String wbCrawer(String url) throws IOException {

        URL url1 = new URL(url);
        //打开这个网址对象
        URLConnection connection = url1.openConnection();
        //获得这个网页的输入流，并转换成为字符流
        InputStream inputStream = connection.getInputStream();
        InputStreamReader stream = new InputStreamReader(inputStream);

        //字符拼接
        StringBuilder builder = new StringBuilder();
        int ch;
        while ((ch = stream.read()) != -1) {

            builder.append((char) ch);
        }

        stream.close();
        return builder.toString();

    }
}

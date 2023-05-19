package test.IO.paQuXingMing;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
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
        //通过正则爬取男生名字
        ArrayList<String> boyList = getDate2(regex2, name2, 1);
        // 通过正则爬取女生名字
        ArrayList<String> girlList = getDate3(regex3, name3, 1);

//        writeData(name1List);
//        writeData(boyList);
//        writeData(girlList);
//        System.out.println(boyList.contains("、日"));


        ArrayList<String> names = getName2(name1List, boyList, girlList, 400, 400);
        Collections.shuffle(names);
//        System.out.println(names);
//        System.out.println(names.size());

        writeData(names);


    }

    /**
     * 更好的生成假数据的方法 林燕珺-女-18
     * @param xing 姓氏列表
     * @param boy 男生名字列表
     * @param girl 女生名字列表
     * @param boyCount 数量
     * @param girlCount 数量
     * @return 以列表形式返回
     */

    private static ArrayList<String> getName2(ArrayList<String> xing, ArrayList<String> boy, ArrayList<String> girl, int boyCount, int girlCount){

        //先利用set来去重
        HashSet<String> boySet = new HashSet<>();
        HashSet<String> girlSet = new HashSet<>();

        while (true){
            if (boySet.size()==boyCount)
                break;
            Collections.shuffle(xing);
            Collections.shuffle(boy);
            boySet.add(xing.get(0)+boy.get(0));
        }

        while (true) {
            if (girlSet.size() == girlCount)
                break;
            Collections.shuffle(xing);
            Collections.shuffle(girl);
            girlSet.add(xing.get(0) + girl.get(0));
        }

        //添加到list并格式化
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (String s : boySet) {
            int age = random.nextInt(10) + 18;//18~27
            list.add(s+ "-男-" + age);
        }
        for (String s : girlSet) {
            int age = random.nextInt(8) + 18;//18~25
            list.add(s+ "-女-" + age);
        }
        return list;
    }



    private static ArrayList<String> getName(ArrayList<String> xing, ArrayList<String> boy, ArrayList<String> girl, int boyCount, int girlCount) {

        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();


        Collections.shuffle(xing);
        Collections.shuffle(boy);

        for (int i = 0; i < boyCount; i++) {
            int age = random.nextInt(10) + 18;//18~27
            int i1 = Math.min(xing.size(), boy.size());
            while (i>= i1){
                i=i- i1;
                boyCount=boyCount-i1;
                Collections.shuffle(xing);
                Collections.shuffle(boy);
            }
            list.add(xing.get(i) + boy.get(i) + "-男-" + age);
        }

        Collections.shuffle(xing);
        Collections.shuffle(girl);
        for (int i = 0; i < girlCount; i++) {
            int age = random.nextInt(8) + 18;//18~25
            int i1=Math.min(xing.size(),girl.size());
            while (i>=i1){
                i=i- i1;
                girlCount=girlCount-i1;
                Collections.shuffle(xing);
                Collections.shuffle(girl);
            }
            list.add(xing.get(i) + girl.get(i) + "-女-" + age);
        }
        return list;


    }

    /**
     * 将集合写到文件
     *
     * @param list 集合
     * @throws IOException
     */
    private static void writeData(ArrayList<String> list) throws IOException {

        //都写到这个文件
        File file = new File("JavaLearnIdea-master\\src\\test\\IO\\paQuXingMing\\name.txt");

        FileWriter fileWriter = new FileWriter(file);
        //日期对象
        LocalDateTime dateTime = LocalDateTime.now();
        //指定日期格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 ahh点mm分");
        fileWriter.write(dateTimeFormatter.format(dateTime) + "\n");
        for (String s : list) {
            fileWriter.write(s+"\n");
        }
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
     *
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

            String str = matcher.group(index);
            if (!str.equals("、日")){
                list.add(str);
            }
            str = matcher.group(index+2);
            if (!str.equals("、日")){
                list.add(str);
            }
        }

        return list;
    }

    /**
     * 提取女生名字
     *
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

package test.IO.paQuXingMing;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/5/19 13:45
 */
public class HutoolTest {

    public static void main(String[] args) {
        //网址
        String url1 = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&device=pc&from=home";
        String url2 = "http://www.haoming8.cn/baobao/10881.html";
        String url3 = "http://www.haoming8.cn/baobao/7641.html";

        //处理数据
        String regex1 = "(.{4})(，|。)";//姓氏正则
        String regex2 = "(.{2})(、|。)(.{2})(、|。)";//名字正则
        String regex3 = "(.{2})( )(.{2})( )(.{2})( )(.{2})( )(.{2})";//名字正则 彤舞 芊静 艾丝 惠蕙 语月

        //请求列表页
        String listContent = HttpUtil.get(url1);
        //使用正则获取所有标题
        List<String> titles = ReUtil.findAll(regex1, listContent, 1);

        ArrayList<String> list = new ArrayList<>();
        for (String title : titles) {
            for (int i = 0; i < 4; i++) {
                list.add((title.substring(i, i + 1)));
            }
        }

        System.out.println(list);

    }

}

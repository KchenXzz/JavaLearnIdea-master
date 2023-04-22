package test.IO.byteStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/13 12:23
 */
public class BianMa {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "空山新雨后";
        byte[] gbks = str.getBytes("gbk");//空参是utf-8

        System.out.println(Arrays.toString(gbks));

        System.out.println(new String(gbks,"gbk"));//空参是utf-8
        System.out.println(new String(gbks));//乱码










    }
}

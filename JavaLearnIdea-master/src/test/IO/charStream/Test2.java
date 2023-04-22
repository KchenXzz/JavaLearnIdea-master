package test.IO.charStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/13 13:16
 */
public class Test2 {
    public static void main(String[] args) throws IOException {

        String str = new String("送元二使安西\n" +
                "渭城朝雨浥轻尘，客舍青青柳色新。\n" +
                "劝君更尽一杯酒，西出阳关无故人。\n");
        String str2 = new String("适兄亍侀宊覀\u000B渮埏朞雩浦轼尙－宣舎靓靓柴艳斱〃\u000B办吜曵尾丁杰酓－覀击阴兴旡敆亻〃\u000B");

        FileWriter file = new FileWriter("JavaLearnIdea-master\\src\\test\\IO\\txtfile.txt",true);

        char[] chars = new char[str.length()];
//        str.getChars(0,str.length(),chars,0);
        str2.getChars(0,str.length(),chars,0);

        for (char aChar : chars) {
            file.write(aChar-1);
        }

        file.close();

    }
}

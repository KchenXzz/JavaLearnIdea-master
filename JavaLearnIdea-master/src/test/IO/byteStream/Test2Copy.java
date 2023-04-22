package test.IO.byteStream;

import java.io.*;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/12 11:30
 */
public class Test2Copy {
    public static void main(String[] args) throws IOException {

        //文件拷贝


        //源文件
        String s = "https://i0.hdslb.com/bfs/archive/a5b2f0330ff297526d0f304f9782d30166bcdd0f.jpg@672w_378h_1c_!web-home-common-cover.webp";
        String s2 = "C:\\AI\\stable-diffusion-webui\\outputs\\txt2img-images\\2023-04-08\\00044-2700419341.png";
        FileInputStream in = new FileInputStream(s2);

        //新文件
        String o1 = "JavaLearnIdea-master\\src\\test\\IO\\a.png";
        FileOutputStream out = new FileOutputStream(o1);

        long l1 = System.currentTimeMillis();

        while (true) {
            byte[] bytes = new byte[1024 * 1024];
            int i = in.read(bytes);
            if (i != -1) {
                out.write(bytes,0,i);
            } else break;
        }
        out.close();
        in.close();
        long l2 = System.currentTimeMillis();
        System.out.println("用时：" + (l2 - l1) + "ms");

    }
}

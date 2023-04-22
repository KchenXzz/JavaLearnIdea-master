package test.IO.bufferedStreams;

import java.io.*;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/16 20:40
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //输入缓冲流
        BufferedInputStream bufferIn = new BufferedInputStream(new FileInputStream("JavaLearnIdea-master\\src\\test\\IO\\bufferedStreams\\txtfile.txt"));//可以接收两个参数，第二个是他的缓冲区size大小
        //输出缓冲流
        BufferedOutputStream bufferOut = new BufferedOutputStream(new FileOutputStream("JavaLearnIdea-master\\src\\test\\IO\\bufferedStreams\\txtfile1.txt"));

        //
        while (true){
            int read = bufferIn.read();
            if (read!=-1){
                bufferOut.write(read);
            }else break;

        }

        bufferOut.close();
        bufferOut.close();

    }
}

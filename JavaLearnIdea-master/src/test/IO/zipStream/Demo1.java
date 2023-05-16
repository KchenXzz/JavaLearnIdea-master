package test.IO.zipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/5/4 12:31
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {


        File src = new File("JavaLearnIdea-master\\src\\test\\IO\\zipStream\\doc.zip");
        File desk = new File("JavaLearnIdea-master\\src\\test\\IO\\zipStream\\doc");

        doZip(src, desk);


    }

    private static void doZip(File scr, File desk) throws IOException {



        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(scr));

        if (!desk.exists()){
            desk.mkdirs();
        }

        ZipEntry entry;
        while ((entry = zipInputStream.getNextEntry()) != null) {

            if (entry.isDirectory()) {
                File file = new File(desk, entry.toString());
                file.mkdirs();
            } else {
                int b;
                File file = new File(desk, entry.toString());

                FileOutputStream fileOutputStream = new FileOutputStream(file);

                while ((b = zipInputStream.read()) != -1) {
                    fileOutputStream.write(b);
                }
                fileOutputStream.close();
                zipInputStream.closeEntry();

            }


        }
        zipInputStream.close();
    }


}


package test.stringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {

        /**
         * 字符序列
         * StringBuilder
         *
         */
        String str1 = "字符串1";

        //String str2="字符串2";

        //默认的构造方法
        StringBuilder sb1 = new StringBuilder();
        //指定长度的构造方法.??
        //StringBuilder sb2=new StringBuilder(6);

        sb1.append("wuhu");
        sb1.append("qifei");


        str1 = str1 + sb1;
        System.out.println(str1);
        System.out.println(sb1.length());
        for (int i = 0; i < sb1.length(); i++) {
            System.out.print(" " + sb1.charAt(i));

        }
        System.out.println();
        //会删除超出设定长度的元素
        sb1.setLength(5);
        System.out.println(sb1);

        //返回指定索引之前的元素的
        System.out.println("返回指定索引之前的元素 " + sb1.codePointBefore(2));

        for (int i = 0; i < sb1.length(); i++) {
            System.out.print(" " + sb1.codePointAt(i));
        }



    }
}

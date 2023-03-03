package test.string.equals;
public class Test {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="ABCD";
        String str3="abcd";
        char[] chars={97,98,99,100};
        String str4=new String(chars);
        String str5=new String("abcd");
        System.out.println(str4);
        //不区分大小写的
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);




    }
}

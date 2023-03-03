package test.string.charAt;

public class Test {
    public static void main(String[] args) {
        String str="芜湖起飞";
        while (true) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

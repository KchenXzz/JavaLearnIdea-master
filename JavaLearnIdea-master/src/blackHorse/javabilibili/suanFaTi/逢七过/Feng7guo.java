package blackHorse.javabilibili.suanFaTi.逢七过;

public class Feng7guo {
    public static void main(String[] args) {
        //逢7过
        //要求如果这个数是7的倍数，或含有7，就打印过

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

    }
}

package blackHorse.javabilibili.suanFaTi.模拟登陆;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        /**
         *
         * 模拟用户登录
         * 给出正确的账号和密码
         * 模拟用户登录，有三次机会，每次登陆后给出相应提示
         *
         */
        //创建个正确的账号和密码
        String account = "yonghu";
        String password = "abc123";
        //比较用户输入和正确账号密码
        Scanner scanner = new Scanner(System.in);
        //每次登录计数，三次机会‘
        for (int count = 1; count < 4; count++) {
            System.out.println("请输入账号");
            String use = scanner.next();
            System.out.println("请输入密码");
            String pass = scanner.next();
            //System.out.println(use);
            //System.out.println(pass);
            //经过比较判断是否正确，以及判断错误原因
            //登录判断后，返回结果给用户
            if (!account.equals(use)) {
                System.out.println("用户名错误");
                System.out.println("您还有" + (3-count) + "次机会");
                if (count == 3) {
                    System.out.println("无法登录");
                }
            } else if (!password.equals(pass)) {
                System.out.println("密码错误");
                System.out.println("您还有" + (3-count) + "次机会");
                if (count == 3) {
                    System.out.println("无法登录");
                }
            } else {
                System.out.println("登陆成功");
                break;
            }
        }


    }
}

package test.loginException;

import java.util.Scanner;

public class LogIn {
    private static final String Name="kcx";
    private static final String Password="111111";


    public static void login(String name,String password){
        if(!Name.equals(name)){
            throw new UserNameException("用户名错误");
        }
        if(!Password.equals(password)){
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }


    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入用户名和密码（回车键隔开）");
            login(sc.nextLine(), sc.nextLine());
        } catch (UserNameException | PasswordException e) {
            e.printStackTrace();
        } finally {
            System.out.println("关闭进程");
        }
    }
}

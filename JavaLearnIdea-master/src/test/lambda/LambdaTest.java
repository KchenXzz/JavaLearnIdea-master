package test.lambda;

import java.lang.reflect.Array;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest {
    public static void main(String[]args){
        var planets=new String[]{"tom","jerry","dog","mimi"};
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        var timer=new Timer(1000,event->
                System.out.println("the time is "+new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null,"quilt program?");
        System.exit(0);



    }
}

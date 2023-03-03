package test.timer;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.Timer;//避免和 java.util.Timer 冲突
public class TimerTest {
    public static void main(String[] args)
    {
        /*
        ActionListener listener=new TimerPrinter();
        //构建一个 timer 它可以每隔10秒钟调用listener
        var timer=new Timer(1000,listener);
         */
        var timer=new Timer(1000,event->{
            System.out.println("At the tone,the time is:"+new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}

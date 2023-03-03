package test.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.Date;

public class TalkingClock {
    private int interval;
    private boolean beep;
    public TalkingClock(int i,boolean b){
        interval=i;
        beep=b;
    }
    public void start(){
        var listener=new TimerPrinter();
        var timer =new Timer(interval,listener);
        timer.start();
    }
    public class TimerPrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("现在时间为："+new Date()
                    +" By "
                    +System.getProperty("user.name")
                    +" "
                    + System.getProperty("os.name"));
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}

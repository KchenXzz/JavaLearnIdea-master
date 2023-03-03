package blackHorse.javabilibili.jFrame.myJframe2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.jFrame.myJframe2
 * @className: myJframe2
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/3 10:45
 * @version: 1.0
 */
public class MyJframe2 extends JFrame implements MouseListener {
    JButton jButton=new JButton("dian");
    public MyJframe2(){
        this.setSize(500, 500);
        this.setTitle("点不到 1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);


        jButton.setBounds(200, 200, 100, 50);
        //绑定鼠标事件
        jButton.addMouseListener(this);
        this.getContentPane().add(jButton);
        this.setVisible(true);




    }


    //单击
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");

    }

    //按下
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下");

    }

    //松开
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");

    }

    //划入
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");

    }


    //划出
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");

    }
}

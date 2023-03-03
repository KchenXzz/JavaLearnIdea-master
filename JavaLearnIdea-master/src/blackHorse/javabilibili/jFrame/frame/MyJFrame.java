package blackHorse.javabilibili.jFrame.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.jFrame.frame
 * @className: MyJFrame
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/3 10:23
 * @version: 1.0
 */
public class MyJFrame extends JFrame implements ActionListener {
    JButton jButton = new JButton("点不到的");
    public MyJFrame() {
        this.setSize(500, 500);
        this.setTitle("点不到 1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);


        jButton.setBounds(200, 200, 100, 50);
        jButton.addActionListener(this);

        this.getContentPane().add(jButton);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        jButton.setLocation(random.nextInt(400), random.nextInt(400));
    }
}

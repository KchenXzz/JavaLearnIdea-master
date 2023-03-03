package test.logging;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.logging.*;

public class ImageViewerFrame extends JFrame{
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HIGHT=400;

    private JLabel label;
    private static Logger logger=Logger.getLogger("test.logging");

    public ImageViewerFrame(){
        logger.entering("ImageViewerFrame","<init>");
        setSize(DEFAULT_WIDTH,DEFAULT_HIGHT);

        var menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        var menu =new JMenu("File");
        menuBar.add(menu);

        var openItem=new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new FileOpenListener());

        var exitItem=new JMenuItem("Exit");
        menu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.fine("Exiting.");
                System.exit(0);
            }
        });
        //display the images

        label=new JLabel();
        add(label);
        logger.exiting("ImageViewerFrame","<init>");
    }
    private class FileOpenListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            logger.entering("ImageViewerFrame.FileOpenListener","acationPerformed",e);

            var chooser=new JFileChooser();
            chooser.setCurrentDirectory(new File("."));

            chooser.setFileFilter(new javax.swing.filechooser.FileFilter(){
                @Override
                public boolean accept(File f) {
                    return f.getName().toLowerCase().endsWith(".gif")||f.isDirectory();
                }

                @Override
                public String getDescription() {
                    return "GIF Images";
                }
            });
            //show file chooser dialog
            int r=chooser.showOpenDialog(ImageViewerFrame.this);
            //if image file accepted ,set it as icon of the label
            if(r==JFileChooser.APPROVE_OPTION){
                String name =chooser.getSelectedFile().getPath();
                logger.log(Level.FINE,"Reading file {0}",name);
                label.setIcon(new ImageIcon(name));
            }else logger.fine("FIle open dialog canceled.");
            logger.exiting("ImageViewerFrame","actionPerformed");
        }
    }
}

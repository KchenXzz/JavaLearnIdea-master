package test.logging;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingImageViewer {
    public static void main(String[]args){
        if(System.getProperty("java.util.logging.config.class")==null
        &&System.getProperty("java.util.logging.config.file")==null){
            try
            {
                Logger.getLogger("test.logging").setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT=10;
                var handler=new FileHandler("%h/LoggingImageViewer.log",0,LOG_ROTATION_COUNT);
                Logger.getLogger("test.logging").addHandler(handler);
            }catch (IOException e){
                Logger.getLogger("test.logging").log(Level.SEVERE,"can't create log file handler",e);
            }
        }
        EventQueue.invokeLater(()->{
            var windowHandler=new WindowHandler();
            windowHandler.setLevel(Level.ALL);
            Logger.getLogger("test.logging").addHandler(windowHandler);

            var frame =new ImageViewerFrame();
            frame.setTitle("LoggingImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Logger.getLogger("test.logging").fine("showing frame");
            frame.setVisible(true);
        });
    }
}

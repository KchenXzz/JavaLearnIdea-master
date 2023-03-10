package test.logging.logTest;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogTest {
    public static Logger log = Logger.getLogger(LogTest.class.toString());
    static {
        Handler console = new ConsoleHandler();
        console.setLevel(Level.SEVERE);
        log.addHandler(console);
        Handler console2 = new ConsoleHandler();
        console2.setLevel(Level.INFO);
        log.addHandler(console2);
    }
    public static void main(String[] args) {
        // all→finest→finer→fine→config→info→warning→server→off
        // 级别依次升高，后面的日志级别会屏蔽之前的级别
        log.setLevel(Level.INFO);
        log.finest("finest");
        log.finer("finer");
        log.fine("fine");
        log.config("config");
        log.info("info");
        log.warning("warning");
        log.severe("server");
    }
}
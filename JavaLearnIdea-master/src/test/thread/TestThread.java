package test.thread;

/**
 * @projectName: JavaLearnIdea
 * @package: test.thread
 * @className: TestThread
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-21 下午 5:20
 * @version: 1.0
 */
public class TestThread {
    public static void main(String[] args) {

        Runable ta = () -> {
            while (true) {
                System.out.println("a");
            }

        };
        Runable tb = () -> {
            while (true) {
                System.out.println("b");
            }

        };

        new Thread((Runnable) ta).start();
        new Thread((Runnable) tb).start();

    }

    public interface Runable {
        void run();
    }


}

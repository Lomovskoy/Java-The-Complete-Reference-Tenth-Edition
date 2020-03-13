package chapter28.simpexec;

import java.util.concurrent.CountDownLatch;

/**
 * В этой программе демонстрируется \
 * простой пример применения исполнителя.
 *
 * @author Ломовской К.Ю.
 * @since 13.03.2020
 */
public class MyThread implements Runnable {

    String name;
    CountDownLatch latch;

    public MyThread(CountDownLatch c, String n) {
        this.name = n;
        this.latch = c;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++){
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}

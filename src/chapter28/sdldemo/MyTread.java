package chapter28.sdldemo;

import java.util.concurrent.CountDownLatch;

/**
 * В этой программе демонстрируется
 * применение класса CountDownLatch.
 *
 * @author Ломовской К.Ю.
 * @since 11.03.2020
 */
public class MyTread implements Runnable{

    CountDownLatch latch;

    public MyTread(CountDownLatch c) {
        this.latch = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
            latch.countDown(); // Обратный отсчёт
        }
    }
}

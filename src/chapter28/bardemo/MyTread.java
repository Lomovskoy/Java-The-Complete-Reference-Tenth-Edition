package chapter28.bardemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * В этой программе демонстрируется поток исполнения,
 * использующий барьер CyclicBarrier.
 *
 * @author Ломовской К.Ю.
 * @since 11.03.2020
 */
public class MyTread implements Runnable {

    CyclicBarrier cBar;
    String name;

    public MyTread(CyclicBarrier c, String n) {
        this.cBar = c;
        this.name = n;
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cBar.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            System.out.println(e);
        }
    }
}

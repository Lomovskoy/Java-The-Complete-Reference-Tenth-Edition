package chapter28.lockdemo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Эта программа демонстрирующая пример
 * блокировки с помощью класа ReentrantLock.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class LockDemo {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A").run();
        new LockThread(lock, "B").run();
    }
}

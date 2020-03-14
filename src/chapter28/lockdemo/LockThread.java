package chapter28.lockdemo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Этот класс демонстрирует поток
 * исполнения инкрементирующий счётчик.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class LockThread implements Runnable {

    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lk, String n){
        this.lock = lk;
        this.name = n;
    }

    @Override
    public void run() {

        System.out.println("Запуск потока " + name);

        try {
            // Сначала заблокируем счётчик
            System.out.println("Поток " + name + " ожидает блокировки счётчика");
            lock.lock();
            System.out.println("Поток " + name + " блокирует счётчик");
            Shared.count++;
            System.out.println("Поток " + name + ": " + Shared.count);
            // Теперь переключаем контекст если это возможно
            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException exc){
            System.out.println(exc);
        } finally {
            // Снять блокировку
            System.out.println("Поток " + name + " разблокирует счётчик");
            lock.unlock();
        }

    }
}

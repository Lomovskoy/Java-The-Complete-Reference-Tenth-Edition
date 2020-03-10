package chapter28.prodcon;

/**
 * В этой программе демонстрируется
 * реализация потавщика и потребителя,
 * использующая симафоры для управления
 * синхронизацией.
 *
 * @author Ломовской К.Ю.
 * @since 10.03.2020
 */
public class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++)
            q.get();
    }
}

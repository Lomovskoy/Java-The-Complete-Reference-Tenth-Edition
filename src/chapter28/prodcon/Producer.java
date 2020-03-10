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
public class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++)
            q.put(i);
    }
}

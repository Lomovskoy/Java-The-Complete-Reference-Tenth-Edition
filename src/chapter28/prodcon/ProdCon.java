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
public class ProdCon {

    public static void main(String[] args) {
        Q q = new Q();

        new Thread(new Consumer(q), "Consumer").start();
        new Thread(new Producer(q), "Producer").start();
    }
}

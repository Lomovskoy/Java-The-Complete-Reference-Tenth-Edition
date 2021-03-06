package chapter11.pcfixed;

/**
 * Программа демонстрирующая,
 * неправильная реализауция постановщика и потребителя.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class Consumer implements Runnable{

    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this,"Потребитель").start();
    }

    public void run() {
        while (true){
            q.get();
        }
    }
}

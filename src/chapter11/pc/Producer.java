package chapter11.pc;

/**
 * Программа демонстрирующая,
 * неправильная реализауция постановщика и потребителя.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class Producer implements Runnable {

    Q q;

    Producer(Q q){
        this.q =  q;
        new Thread(this, "Поставщик").start();
    }

    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
        }
    }
}

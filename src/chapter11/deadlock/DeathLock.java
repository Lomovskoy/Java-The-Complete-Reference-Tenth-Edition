package chapter11.deadlock;

/**
 * Программа демонстрирующая,
 * взаимную блокировку.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class DeathLock implements Runnable{

    A a = new A();
    B b = new B();

    DeathLock(){
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();
        a.foo(b);   // Получить блокировку для объекта
                    // а в главном потоке исполнения
        System.out.println("Назад в главный поток");
    }

    public void run() {
        b.bar(a);   // Получить блокировку для объекта
                    // b в другом потоке исполнения
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new DeathLock();
    }
}

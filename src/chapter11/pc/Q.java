package chapter11.pc;

/**
 * Программа демонстрирующая,
 * неправильная реализауция постановщика и потребителя.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class Q {

    int n;

    synchronized int get(){
        System.out.println("Получено: " + n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Отправленно: " + n);
    }
}

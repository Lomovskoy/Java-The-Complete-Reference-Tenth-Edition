package chapter11.pc;

/**
 * Программа демонстрирующая,
 * неправильная реализауция постановщика и потребителя.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class PC {

    public static void main(String[] args) {

        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Для остановки нажмите Ctrl + C");
    }
}

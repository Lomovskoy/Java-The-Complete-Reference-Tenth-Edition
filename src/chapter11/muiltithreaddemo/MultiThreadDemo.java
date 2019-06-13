package chapter11.muiltithreaddemo;

/**
 * Программа демонстрирующая,
 * создание множества потоков исполнения.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
class MultiThreadDemo {

    public static void main(String[] args) {
        new NewThread("Один");
        new NewThread("Два");
        new NewThread("Три");
        try {
            // Ожидать завершения других потоков исполнениня
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершён.");
    }
}

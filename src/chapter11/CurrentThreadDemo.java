package chapter11;

/**
 * Программа демонстрирующая,
 * управление главным потоком исполнения.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
public class CurrentThreadDemo {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текщий поток исполнения: " + t);

        // Изменить имя потока исполнения
        t.setName("My thread");
        System.out.println("После изменения имени потока: " + t);

        try {
            for (int n = 5; n > 0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный поток имполнения прерван");
        }
    }
}

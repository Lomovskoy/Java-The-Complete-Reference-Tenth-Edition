package chapter11.threaddemo;

/**
 * Программа демонстрирующая,
 * создание второго потока исполнения.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
public class ThreadDemo {

    public static void main(String[] args) {
        // Создать новый поток
        new NewThread();

        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток заввершён.");
    }
}

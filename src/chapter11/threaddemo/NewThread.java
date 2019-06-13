package chapter11.threaddemo;

/**
 * Программа демонстрирующая,
 * создание второго потока исполнения.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
public class NewThread implements Runnable{

    Thread t;

    NewThread(){
        // Создать новый, второй поток исполнения
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Дочерний поток завершён.");
        }
    }
}

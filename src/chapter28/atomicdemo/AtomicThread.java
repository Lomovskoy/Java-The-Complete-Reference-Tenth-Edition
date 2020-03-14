package chapter28.atomicdemo;

/**
 * Этот класс демонстрирует поток
 * исполнения инкрементирующий счётчик.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class AtomicThread implements Runnable{

    String name;

    AtomicThread(String n){
        name = n;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        for (int i = 1; i <= 3; i++){
            System.out.println("Поток " + name + " получено: " + Shared.ai.getAndSet(i));
        }
    }
}

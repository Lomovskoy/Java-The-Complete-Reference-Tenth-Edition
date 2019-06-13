package chapter11.extandthread;

/**
 * Программа демонстрирующая, создание второго потока
 * исполнения путём наследования суперкласса Thread.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
class NewThread extends Thread {

    NewThread(){
        // Создать новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start();    // Запустить поток на исполнение
    }

    // Точка входа во второй поток исполнителей
    public void run(){
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Дочернийпоток прерван");
        }
        System.out.println("Дочерний поток завершён.");
    }
}

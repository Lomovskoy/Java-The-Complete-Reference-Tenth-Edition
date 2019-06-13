package chapter11.extandthread;

/**
 * Программа демонстрирующая, создание второго потока
 * исполнения путём наследования суперкласса Thread.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
class ExtendThread {

    public static void main(String[] args) {
        new NewThread();    // Создать новый поток исполнения

        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главнцыйпоток завершён.");
    }
}

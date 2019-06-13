package chapter11.demojoin;

/**
 * Программа демонстрирующая, создание множества потоков
 * исполнения и ожидание их завершения через метод join.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
class NewThread implements Runnable{
    String name;    // Имя потока
    Thread t;

    NewThread(String threadMame){
        name = threadMame;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершён.");
    }
}

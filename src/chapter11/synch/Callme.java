package chapter11.synch;

/**
 * Программа демонстрирующая,
 * не синхронизированный потоки.
 *
 * @author Ломовской К.Ю.
 * @since 13.06.2019
 */
class Callme {

    void call(String mgs){

        System.out.print("["+ mgs);

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Прервано");
        }
        System.out.print("]");
    }

}

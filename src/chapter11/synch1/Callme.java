package chapter11.synch1;

/**
 * Программа демонстрирующая,
 * синхронизированный бок кода.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
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

package chapter28.bardemo;

/**
 * Объект этого класса вызывается по достижении
 * барьера типа CyclicBarrier.
 *
 * @author Ломовской К.Ю.
 * @since 11.03.2020
 */
public class BarAction implements Runnable{

    @Override
    public void run() {
        System.out.println("Барьер достигнут");
    }
}

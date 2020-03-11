package chapter28.exgrdemo;

import java.util.concurrent.Exchanger;

/**
 * В этой программе демонстрируется
 * примение класса Exchanger.
 *
 * @author Ломовской К.Ю.
 * @since 11.03.2020
 */
public class ExgrDemo {

    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();

        new Thread(new UseString(exgr)).start();
        new Thread(new MakeString(exgr)).start();
    }
}

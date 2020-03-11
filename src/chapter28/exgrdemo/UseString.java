package chapter28.exgrdemo;

import java.util.concurrent.Exchanger;

/**
 * В этом классе поток типа
 * Thread испоьзует символьную строку.
 *
 * @author Ломовской К.Ю.
 * @since 11.03.2020
 */
public class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++){
            try {
                // Обмениваем заполненный буфер на пустой
                str = ex.exchange(new String());
                System.out.println("Получено: " + str);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

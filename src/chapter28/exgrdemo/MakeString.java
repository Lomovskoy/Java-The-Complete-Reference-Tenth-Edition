package chapter28.exgrdemo;

import java.util.concurrent.Exchanger;

/**
 * В этом классе поток типа
 * Thread формирует символьную строку.
 *
 * @author Ломовской К.Ю.
 * @since 11.03.2020
 */
public class MakeString implements Runnable {

    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        this.str = new String();
    }

    @Override
    public void run() {
        char ch = 'A';

        for (int i = 0; i < 5; i++){
            // Заполняем буфер
            for (int j = 0; j < 5; j++)
                str += (char) ch++;

            try {
                // Обмениваем заполненный буфер на пустой
                str = ex.exchange(str);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

package chapter12.askme;

import java.util.Random;

/**
 * Программа демонстрирующая, усовершенствованную версию программы
 * принятия решений. В этой версии для представляния возможных
 * ответов используя перечисление, а не переменные экземпляра.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
public class Question {

    Random rand = new Random();

    Amswer ask(){

        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15)
            return Amswer.MABE;     // 15%
        else if (prob < 30)
            return Amswer.NO;       // 15%
        else if (prob < 60)
            return Amswer.YES;      // 30%
        else if (prob < 75)
            return Amswer.LATER;    // 15%
        else if (prob < 98)
            return Amswer.SOON;     // 13%
        else
            return Amswer.NEVER;
    }
}

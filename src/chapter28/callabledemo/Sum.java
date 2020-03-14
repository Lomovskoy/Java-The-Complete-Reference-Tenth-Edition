package chapter28.callabledemo;

import java.util.concurrent.Callable;

/**
 * Этот класс реализоует отдельный
 * поток вычисления.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class Sum implements Callable<Integer> {

    int stop;

    Sum(int v){
        this.stop = v;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= stop; i++){
            sum += i;
        }
        return sum;
    }
}

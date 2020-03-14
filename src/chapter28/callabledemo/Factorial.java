package chapter28.callabledemo;

import java.util.concurrent.Callable;

/**
 * Этот класс реализоует отдельный
 * поток вычисления.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class Factorial implements Callable<Integer> {

    int stop;

    Factorial(int v){
        this.stop = v;
    }

    @Override
    public Integer call() {
        int fact = 1;

        for (int i = 2; i <= stop; i++){
            fact *= i;
        }

        return fact;
    }
}

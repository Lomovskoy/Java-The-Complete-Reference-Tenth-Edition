package chapter28.callabledemo;

import java.util.concurrent.Callable;

/**
 * Этот класс реализоует отдельный
 * поток вычисления.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class Hypot implements Callable<Double> {

    double side1, side2;

    public Hypot(double s1, double s2) {
        this.side1 = s1;
        this.side2 = s2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side2) + (side1 * side2));
    }
}

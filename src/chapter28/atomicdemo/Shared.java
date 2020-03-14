package chapter28.atomicdemo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Этот класс является общим ресурсом.
 *
 * @author Ломовской К.Ю.
 * @since 14.03.2020
 */
public class Shared {
    static AtomicInteger ai = new AtomicInteger(0);
}

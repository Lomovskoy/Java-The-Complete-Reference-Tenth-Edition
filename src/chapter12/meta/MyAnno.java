package chapter12.meta;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Программа демонстрирующая, удержание класса
 * MyAnnoRun со степенью сохранности RUNTIME.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

    String atr();

    int val();
}

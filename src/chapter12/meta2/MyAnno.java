package chapter12.meta2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Программа демонстрирующая, удержание класса
 * MyAnnoRun со степенью сохранности RUNTIME.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

    String str();

    int val();
}

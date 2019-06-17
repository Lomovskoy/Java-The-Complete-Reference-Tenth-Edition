package chapter12.repeatanno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Программа демонстрирующая,
 * контейнерная аннотация
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepreatedAnnos {
    MyAnno[] value();
}

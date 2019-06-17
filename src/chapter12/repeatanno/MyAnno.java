package chapter12.repeatanno;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Программа демонстрирующая,
 * применение повторяющихся аннотаций.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepreatedAnnos.class)
@interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}

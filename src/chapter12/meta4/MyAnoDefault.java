package chapter12.meta4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Программа демонстрирующая,
 * значения в аннотации по умолчанию.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnoDefault {
    String str() default "Тестирование";
    int val() default 9000;
}

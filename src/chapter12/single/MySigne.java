package chapter12.single;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Программа демонстрирующая,
 * одночленной аннотации.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MySigne {
    int value();
}

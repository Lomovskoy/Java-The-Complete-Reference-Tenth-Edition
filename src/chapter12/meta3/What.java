package chapter12.meta3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Программа демонстрирующая, получения всех
 * анотаций для класса и метода с посошью рефлекции.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface What {
    String description();
}

package chapter12.markerannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Программа демонстрирующая,
 * маркерный аннотации.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

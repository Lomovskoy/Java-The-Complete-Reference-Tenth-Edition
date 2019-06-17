package chapter12.typeannodemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Программа демонстрирующая, аннотацию маркер,
 * которую можно применить к типу данных.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
@Target(ElementType.TYPE_USE)
@interface NotZeroLen { }

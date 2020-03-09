package chapter27.imagefilterdemo;

import java.awt.*;

/**
 * Этот интерфейс демонстрирует абстракцию процесса фильтрации,
 * принимает в качестве параметров Фрейм и исходное изображение
 * и возвращает новое отфильтрованное некоторым образом изображение.
 *
 * @author Ломовской К.Ю.
 * @since 09.03.2020
 */
public interface PlugInFilter {
    Image filter(Frame f, Image in);
}

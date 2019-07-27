package chapter15.genericmethotrefdemo;

/**
 * Обощённый класс определяющзий метод countMatChild(), возвращающий количество элементов в массиве, равных
 * указанному значению. Обратите внимание на то, что  метод countMatChild() является обощённым тогда как клкасс
 * MyArrayOps - не обощённым.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class MyArrayOps {

    static <T> int countMatChild(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v) count++;

        return count;
    }
}

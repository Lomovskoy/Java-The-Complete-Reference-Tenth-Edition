package chapter15.constructorrefdemo3;

/**
 * Класс демонстрирующий ссылку на обощённый метод,
 * что бынайти максимальное значение в коллекции.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class MyClass<T> {

    private T val;

    // Это конструктор с аргументами
    MyClass(T v) { val = v; }

    // Это конструктор по умолчанию
    MyClass() { val = null; }

    T getVal() { return val;}
}

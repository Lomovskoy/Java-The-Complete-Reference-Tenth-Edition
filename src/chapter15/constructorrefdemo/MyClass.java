package chapter15.constructorrefdemo;

/**
 * Класс демонстрирующий ссылку на метод,
 * что бынайти максимальное значение в коллекции.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class MyClass {

    private int val;

    // Это конструктор с аргументами
    MyClass(int v) { val = v; }

    // Это конструктор по умолчанию
    MyClass() { val = 0; }

    int getVal() { return val;}
}

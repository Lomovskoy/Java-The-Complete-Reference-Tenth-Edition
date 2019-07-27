package chapter15.constructorrefdemo3;

/**
 * Класс демонстрирующий ссылку на обощённый метод,
 * что бынайти максимальное значение в коллекции.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class MyClass2 {

    String str;

    // Это конструктор с аргументами
    MyClass2(String s) { str = s; }

    // Это конструктор по умолчанию
    MyClass2() { str = ""; }

    String getVal() { return str;}
}

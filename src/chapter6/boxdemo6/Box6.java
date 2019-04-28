package chapter6.boxdemo6;

/**
 * Программа демонстрирующая,
 * класс Box с методами конструктором.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class Box6 {
    double wight;
    double height;
    double depth;

    // Возвратить объем паралеллепипеда
    double volume(){
        return wight * height * depth;
    }

    // Конструктор класса
    Box6(){
        System.out.println("Конструирование объекта Box");
        wight = 10;
        height = 10;
        depth = 10;
    }


}

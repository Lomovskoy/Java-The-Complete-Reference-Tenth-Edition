package chapter6.boxdemo4;

/**
 * Программа демонстрирующая,
 * класс Box с методами возвращающими значение.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class Box4 {
    double wight;
    double height;
    double depth;

    // Возвратить объем паралеллепипеда
    double volume(){
        return wight * height * depth;
    }
}

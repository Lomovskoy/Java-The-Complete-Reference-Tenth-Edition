package chapter6.boxdemo7;

/**
 * Программа демонстрирующая, класс Box с
 * методами и параметризованным конструктором.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class Box7 {
    double wight;
    double height;
    double depth;

    // Конструктор класса
    public Box7(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    // Возвратить объем паралеллепипеда
    double volume(){
        return wight * height * depth;
    }

}

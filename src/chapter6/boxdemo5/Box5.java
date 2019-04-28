package chapter6.boxdemo5;

/**
 * Программа демонстрирующая,
 * класс Box с методами и папаметрами.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class Box5 {
    double wight;
    double height;
    double depth;

    // Возвратить объем паралеллепипеда
    double volume(){
        return wight * height * depth;
    }

    // Установить объем паралеллепипеда
    void setDim(double w, double h, double d){
        wight = w;
        height = h;
        depth = d;
    }
}

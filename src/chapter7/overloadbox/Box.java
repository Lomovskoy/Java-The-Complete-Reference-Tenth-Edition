package chapter7.overloadbox;

/**
 * Программа демонстрирующая, класс Box с
 * перегруженными контрукторами.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
class Box {
    double wight;
    double height;
    double depth;

    // Конструктор класса со всеми тремя параметрами
    public Box(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    // Конструктор класса по умолчанию
    public Box() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор класса используемый создания куба
    public Box(double len){
        wight = height = depth = len;
    }

    // Возвратить объем паралеллепипеда
    double volume(){
        return wight * height * depth;
    }

}

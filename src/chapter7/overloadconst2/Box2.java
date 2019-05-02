package chapter7.overloadconst2;

/**
 * Программа демонстрирующая, класс Box с перегруженными контрукторами,
 * где один объект допускается инициализировать другим обьектом.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
class Box2 {
    double wight;
    double height;
    double depth;

    // Этот конструктор принимает оъект типа Box
    // для инициализации текущего
    Box2(Box2 ob){
        wight = ob.wight;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор класса со всеми тремя параметрами
    Box2(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    // Конструктор класса по умолчанию
    Box2() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор класса используемый создания куба
    Box2(double len){
        wight = height = depth = len;
    }

    // Возвратить объем паралеллепипеда
    double volume(){
        return wight * height * depth;
    }

}

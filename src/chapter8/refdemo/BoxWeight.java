package chapter8.refdemo;

/**
 * Программа демонстрирующая, расширение класса Box
 * добавляя в него поле веса.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class BoxWeight extends Box {

    // Вес паралелепипеда
    double weight;

    // Конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m){
        widht = w;
        height = h;
        depth = d;
        weight = m;
    }
}

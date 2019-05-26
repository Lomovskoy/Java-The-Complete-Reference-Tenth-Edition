package chapter8.demosuper;

/**
 * Программа демонстрирующая, создание супер класса.
 *
 * @author Ломовской К.Ю.
 * @since 26.05.2019
 */
class Box {

    double widht;
    double height;
    double depth;

    // Сконструировать клон объекта
    Box(Box ob){ // Передать объект конструктору
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, применяемый при указании всех параметров
    Box(double w, double h, double d){
        widht = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемы при отсутствии размеров
    Box(){
        widht = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор, применяемый при создании куба
    Box(double len){
        widht = height = depth = len;
    }

    // Расчитать и возвратить объем
    double volume(){
        return widht * height * depth;
    }
}

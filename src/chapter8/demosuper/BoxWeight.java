package chapter8.demosuper;

/**
 * Программа демонстрирующая, расширение класса Box
 * добавляя в него поле веса, реализованны все конструкторы.
 *
 * @author Ломовской К.Ю.
 * @since 26.05.2019
 */
class BoxWeight extends Box {

    // Вес паралелепипеда
    double weight;

    // Сконструировать клон объекта
    BoxWeight(BoxWeight ob){ // Передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // Конструктор применяемый при всех переметров
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d); // Вызов конструктора суперкласса
        weight = m;
    }

    // Конструктор, применяемы по умолчанию

    public BoxWeight() {
        super();
        weight = -1;
    }

    // Конструктор применяемый при создании куба
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

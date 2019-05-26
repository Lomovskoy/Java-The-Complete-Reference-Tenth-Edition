package chapter8.demoshipment;

/**
 * Программа демонстрирующая,
 * создание поле с стоимостью доставки.
 *
 * @author Ломовской К.Ю.
 * @since 26.05.2019
 */
class Shipment extends BoxWeight {

    double cost;

    // Создать клон объекта
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    // Конструктор, используемый при указании вех переметров
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    Shipment(){
        super();
        cost = -1;
    }

    // Конструктор применяемый при создании куба
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}

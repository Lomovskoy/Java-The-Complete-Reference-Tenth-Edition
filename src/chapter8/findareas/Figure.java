package chapter8.findareas;

/**
 * Программа демонстрирующая,
 * динамического полиморфизма.
 *
 * @author Ломовской К.Ю.
 * @since 09.06.2019
 */
class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("Площадь фигурын не определена.");
        return 0;
    }
}

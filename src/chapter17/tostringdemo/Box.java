package chapter17.tostringdemo;

/**
 * Класс демонстрирующий переопределение
 * метода toString() в классе Box.
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class Box {

    double width;
    double height;
    double depth;

    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    @Override
    public String toString() {
        return "Размеры " + width + " на " + height + " на " + depth + ".";
    }
}

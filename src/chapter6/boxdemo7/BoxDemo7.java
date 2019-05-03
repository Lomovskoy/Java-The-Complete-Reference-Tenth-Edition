package chapter6.boxdemo7;

/**
 * Программа демонстрирующая,
 * использование класаа Box с методом инициализации.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class BoxDemo7 {

    public static void main(String[] args) {

        // Объявить, выделить память и инициализировать объекты типа Box
        Box7 myBox1 = new Box7(10, 20, 15);
        Box7 myBox2 = new Box7(3, 6, 9);
        double vol;

        // Получить объем первого паралелепипеда
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // Получить объем второго паралелепипеда
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}

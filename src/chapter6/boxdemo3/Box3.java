package chapter6.boxdemo3;

/**
 * Программа демонстрирующая,
 * класс Box с методами.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class Box3 {
    double wight;
    double height;
    double depth;

    // Вывести объем паралеллепипеда
    void volume(){
        System.out.print("Объем равен ");
        System.out.println(wight * height * depth);
    }
}

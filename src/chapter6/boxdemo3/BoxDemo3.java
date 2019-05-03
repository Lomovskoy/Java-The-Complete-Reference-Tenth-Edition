package chapter6.boxdemo3;

/**
 * Программа демонстрирующая,
 * использование класаа Box с методами.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class BoxDemo3 {

    public static void main(String[] args) {
        // Объявляется объект типа Box
        Box3 myBox1 = new Box3();
        Box3 myBox2 = new Box3();

        // Присвоить значение переменным экземпляра класса myBox
        myBox1.wight = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        // Присвоить другие значения переменным экземпляра класса myBox
        myBox2.wight = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Вывести объем первого паралелепипеда
        myBox1.volume();

        // Вывести объем второго паралелепипеда
        myBox2.volume();
    }
}

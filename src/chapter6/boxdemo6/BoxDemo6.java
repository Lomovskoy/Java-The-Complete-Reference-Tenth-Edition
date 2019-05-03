package chapter6.boxdemo6;

/**
 * Программа демонстрирующая,
 * использование класаа Box возвращающий значение.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class BoxDemo6 {

    public static void main(String[] args) {

        // Объявить, выделить память и инициализировать объекты типа Box
        Box6 myBox1 = new Box6();
        Box6 myBox2 = new Box6();
        double vol;

        // Получить объем первого паралелепипеда
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // Получить объем второго паралелепипеда
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}

package chapter6.boxdemo5;

/**
 * Программа демонстрирующая,
 * использование класаа Box возвращающий значение.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
public class BoxDemo5 {

    public static void main(String[] args) {
        // Объявляется объект типа Box
        Box5 myBox1 = new Box5();
        Box5 myBox2 = new Box5();
        double vol;

        // Инициализировать каждый экземпляр класса Box
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        // Получить объем первого паралелепипеда
        vol = myBox1.volume();
        System.out.println("Объем павен " + vol);

        // Получить объем второго паралелепипеда
        vol = myBox2.volume();
        System.out.println("Объем павен " + vol);
    }
}

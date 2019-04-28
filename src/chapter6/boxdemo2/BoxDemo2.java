package chapter6.boxdemo2;

/**
 * Программа демонстрирующая,
 * использование класаа Box.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
public class BoxDemo2 {

    public static void main(String[] args) {
        // Объявляется объект типа Box
        Box2 myBox = new Box2();
        double vol;

        // Присвоить значение переменным экземпляра класса myBox
        myBox.wight = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // Расчёт объема паралелепипеда
        vol = myBox.wight * myBox.height * myBox.depth;

        System.out.println("Объем павен " + vol);
    }
}

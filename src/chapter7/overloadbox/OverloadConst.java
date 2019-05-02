package chapter7.overloadbox;

/**
 * Программа демонстрирующая, использвания
 * класса Box с перегруженными контрукторами.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
public class OverloadConst {

    public static void main(String[] args) {

        // Создание паралелепипеда используя разные конструктогры
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double vol;

        // Получаем объем первого паралелепипеда
        vol = myBox1.volume();
        System.out.println("Объем myBox1 = " + vol);

        // Получаем объем второго паралелепипеда
        vol = myBox2.volume();
        System.out.println("Объем myBox2 = " + vol);

        // Получаем объем третьего паралелепипеда
        vol = myCube.volume();
        System.out.println("Объем myCube = " + vol);
    }
}

package chapter7.overloadconst2;

/**
 * Программа демонстрирующая, использвания класса Box с перегруженными
 * контрукторами один из которых принемает объект для инициализхации вызываемого объекта.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
public class OverloadConst {

    public static void main(String[] args) {

        // Создание паралелепипеда используя разные конструктогры
        Box2 myBox1 = new Box2(10, 20, 15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);

        Box2 myClone = new Box2(myBox1);

        // Создать копию 1го объекта
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

        // Получаем объем клона паралелепипеда
        vol = myClone.volume();
        System.out.println("Объем клона = " + vol);
    }
}

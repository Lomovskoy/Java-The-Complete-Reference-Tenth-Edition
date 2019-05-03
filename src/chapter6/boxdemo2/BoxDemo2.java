package chapter6.boxdemo2;

/**
 * Программа демонстрирующая,
 * использование класаа Box.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class BoxDemo2 {

    public static void main(String[] args) {
        // Объявляется объект типа Box
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();
        double vol;

        // Присвоить значение переменным экземпляра класса myBox
        myBox1.wight = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        // Присвоить другие значения переменным экземпляра класса myBox
        myBox2.wight = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Расчёт объема первого паралелепипеда
        vol = myBox1.wight * myBox1.height * myBox1.depth;
        System.out.println("Объем равен " + vol);

        // Расчёт объема второго паралелепипеда
        vol = myBox2.wight * myBox2.height * myBox2.depth;
        System.out.println("Объем равен " + vol);
    }
}

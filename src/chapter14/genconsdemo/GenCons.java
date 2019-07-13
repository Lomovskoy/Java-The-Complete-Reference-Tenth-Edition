package chapter14.genconsdemo;

/**
 * Класс демонстрирующий
 * простой обощённый конструктор.
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class GenCons {

    private double val;

    <T extends Number> GenCons(T arg){
        val = arg.byteValue();
    }

    void showVal(){
        System.out.println("val: " + val);
    }
}

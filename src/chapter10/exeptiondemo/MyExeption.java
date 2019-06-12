package chapter10.exeptiondemo;

/**
 * Программа демонстрирующая,
 * создание специального типа исклчюения.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
class MyExeption extends Exception{

    private int detail;

    public MyExeption(int a) {
        detail = a;
    }

    public String toString(){
        return "MyExeption[" + detail + "]";
    }
}

package chapter8.access;

/**
 * Программа демонстрирующая, что член j в супер классе А .
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class B extends A {

    int total;

    void sum(){
        total = i;// + j; // Ошибка: член j в этом классе недоступен
    }
}

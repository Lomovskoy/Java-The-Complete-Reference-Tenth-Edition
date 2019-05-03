package chapter7.passobjre;

/**
 * Программа демонстрирующая, что передача
 * значение передаётся по ссылке.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
class Test2 {

    int a, b;

    Test2(int i, int j){
        a = i;
        b = j;
    }

    // Передать объект
    void meth(Test2 o){
        o.a *= 2;
        o.b /= 2;
    }
}

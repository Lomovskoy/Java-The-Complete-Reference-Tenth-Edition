package chapter7.retob;

/**
 * Программа демонстрирующая, возврат объекта.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
class Test {
    int a;

    Test(int i){
        a = i;
    }

    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }
}

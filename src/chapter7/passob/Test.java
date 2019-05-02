package chapter7.passob;

/**
 * Программа демонстрирующая, объект
 * для передачи в качестве параметра.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
public class Test {

    int a, b;

    public Test(int i, int j) {
        a = i;
        b = j;
    }

    // Возвращает логическое значение true, если
    // в квачестве параметра o указан вызывающий объект
    boolean equalTo(Test o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

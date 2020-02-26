package chapter21.serializationdemo;

import java.io.Serializable;

/**
 * Класс демонстрирующий применение
 * сериализации и десериализации.
 *
 * @author Ломовской К.Ю.
 * @since 26.02.2020
 */
public class MyClass implements Serializable {

    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}

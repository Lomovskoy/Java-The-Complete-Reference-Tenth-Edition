package chapter15.usemethodref;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Класс демонстрирующий использование ссылки на метод,
 * чтобы найти максимальное значение в коллекции.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class UseMethoDref {

    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {

        ArrayList<MyClass> al = new ArrayList<MyClass>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        // Найти максимальное значение, используя метод
        MyClass maxValObj = Collections.max(al, UseMethoDref::compareMC);

        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }

}

package chapter9.p2;

import chapter9.p1.Protection;

/**
 * Программа демонстрирующая,
 * пример доступа к пакетам.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class Protection2 extends Protection {

    Protection2(){
        System.out.println("Конструктор, унаследованный из другого пакета");

        // Доступно только для данного класса
        // System.out.println("nPri = 4" + nPri);

        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}

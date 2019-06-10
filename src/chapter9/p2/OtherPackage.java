package chapter9.p2;

import chapter9.p1.Protection;

/**
 * Программа демонстрирующая,
 * пример доступа к пакетам.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class OtherPackage {

    OtherPackage(){
        Protection p = new Protection();
        System.out.println("Кониструктор из другого пакета");

        // Доступно только для данного класса или пакета
        // System.out.println("n = " + n);

        // Доступно только для данного класса
        // System.out.println("nPri = 4" + nPri);

        // Доступно только для данного класса подкласса или пакета
        //System.out.println("nPro = " + nPro);

        System.out.println("nPub = " + p.nPub);
    }
}

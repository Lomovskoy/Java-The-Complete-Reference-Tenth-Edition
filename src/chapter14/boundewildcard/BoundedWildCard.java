package chapter14.boundewildcard;

/**
 * Класс демонстрирующий применение,
 * ограниченных метасимволов подстановки.
 *
 * @author Ломовской К.Ю.
 * @since 06.07.2019
 */
class BoundedWildCard {

    static void showXY(Coords<?> c){
        System.out.println("Коардинаты X Y:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("Коардинаты X Y:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z);
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c){
        System.out.println("Коардинаты X Y:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " +
                    c.coords[i].y + " " +
                    c.coords[i].z + " " +
                    c.coords[i].t);
        System.out.println();
    }

    public static void main(String[] args) {

        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23),
        };

        Coords<TwoD> tdLocs = new Coords<TwoD>(td);

        System.out.println("Содержимое объекта tdLocs.");
        showXY(tdLocs); // Верно это объект TwoD
        //showXYZ(tdLocs); // Ошибка, это не объект ThreeD
        //showAll(tdLocs); // Ошибка, это не объект FourD

        // Теперь создадим несколько объектов типа FourD
        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17),
        };

        Coords<FourD> fdLocs = new Coords<FourD>(fd);

        System.out.println("Содержимое объекта fdLocs.");
        // Здесь всё верно
        showXY(fdLocs);
        showXYZ(fdLocs);
        showAll(fdLocs);
    }
}

package chapter14.boundewildcard;

/**
 * Класс демонстрирующий,
 * хранение массива координатных объектов.
 *
 * @author Ломовской К.Ю.
 * @since 06.07.2019
 */
class Coords<T extends TwoD> {

    T[] coords;

    Coords(T[] o){
        coords = o;
    }
}

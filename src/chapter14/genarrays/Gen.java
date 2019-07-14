package chapter14.genarrays;

/**
 * Класс демонстрирующий, обощения и массивы.
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class Gen<T extends Number>{

    T ob;

    T[] vals; // Верно!

    Gen(T o, T[] nums){

        ob = o;

        // Этот оператор неверен, нельзя создать массив объектов типа Т
        // vals = new T[10];

        // Этот ператор верен
        vals = nums;
    }
}

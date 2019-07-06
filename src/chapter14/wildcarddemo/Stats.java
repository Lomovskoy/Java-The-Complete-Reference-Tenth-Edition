package chapter14.wildcarddemo;

/**
 * Класс Stats - применение метасимволов
 * подстановки в качестве аргументоа.
 *
 * @author Ломовской К.Ю.
 * @since 06.07.2019
 */
class Stats<T extends Number> {

    T[] nums; // nums - это массив элементов типа T

    // Передать конструктору ссылку на массив значений типа T
    Stats(T[] o){
        nums = o;
    }

    // Возвратить значение типа double в любом случае
    double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }

    // Определить равенство двух средних значений.
    // Обратите внимание на применение метта символа подстановки.
    boolean sameAvg(Stats<?> ob){
        if (average() == ob.average())
            return true;
        return false;
    }
}

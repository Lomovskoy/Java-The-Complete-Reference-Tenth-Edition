package chapter14.boundsdemo;

/**
 * Класс Stats - аргумент типа T должен быть классом
 * Number или наследуемым от него классом
 *
 * @author Ломовской К.Ю.
 * @since 05.07.2019
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
}

package chapter14;

/**
 * Класс Stats - пример безуспешной попытки создать
 * обощенный класс для вычисления среднего значения
 * массива чисел заданньго типа.
 * Этот класс содержит ошибку!
 *
 * @author Ломовской К.Ю.
 * @since 05.07.2019
 */
class Stats<T> {
    T[] nums; // nums - это массив элементов типа T

    // Передать конструктору ссылку на массив значений типа T
    Stats(T[] o){
        nums = o;
    }

    // Возвратить значение типа double в любом случае
    double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue(); // Ошибка!!!
        return sum / nums.length;
    }
}

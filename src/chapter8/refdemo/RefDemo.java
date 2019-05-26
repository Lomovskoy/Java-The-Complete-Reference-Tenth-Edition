package chapter8.refdemo;

/**
 * Программа демонстрирующая, что переменная
 * суперкласса может ссфлаться на объект подкласса.
 *
 * @author Ломовской К.Ю.
 * @since 26.05.2019
 */
public class RefDemo {

    public static void main(String[] args) {

        BoxWeight boxWeight = new BoxWeight(3, 5, 7, 8.37);
        Box box = new Box();
        double vol;

        vol = boxWeight.volume();
        System.out.println("Объём boxWeight равен " + vol);
        System.out.println("Вес boxWeight равен " + boxWeight.weight);
        System.out.println();

        // Присвоить переменной ссылки на объект типа BoxWeight
        // ссфлку на объект типа Box
        box = boxWeight;
        vol = box.volume(); // Верно, так как метод volume() определён в классе Box
        System.out.println("Объём boxWeight равен " + vol);

        // Следующий оператор ошибочен, поскольку в классе box не определён метод weight
        //System.out.println("Вес boxWeight равен " + box.weight);
    }
}

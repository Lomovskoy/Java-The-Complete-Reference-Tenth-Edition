package chapter18.rtti;

/**
 * Класс демонстрирующий получение
 * сведений о типе объекта во время выполнения.
 *
 * @author Ломовской К.Ю.
 * @since 23.08.2019
 */
class RTTY {

    public static void main(String[] args) {

        X x = new X();
        Y y = new Y();

        Class<?> clObj;

        // Получить ссылку на объект типа Class
        clObj = x.getClass();
        System.out.println("x - объект типа: " + clObj.getName());

        // Получить ссылку на объект типа Class
        clObj = y.getClass();
        System.out.println("y - объект типа: " + clObj.getName());

        clObj = clObj.getSuperclass();
        System.out.println("Суперкласс объекта y: " + clObj.getName());

    }
}

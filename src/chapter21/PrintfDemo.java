package chapter21;

/**
 * Класс демонстрирующий использование
 * метода printf().
 *
 * @author Ломовской К.Ю.
 * @since 23.02.2020
 */
public class PrintfDemo {

    public static void main(String[] args) {

        System.out.println("Ниже преведены некотрые числовые значения в разных форматах.\n");

        System.out.print("Разные целочисленные форматы: ");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);
        System.out.println();

        System.out.printf("Формат чисел с плавающей точкой по умолчанию: %f\n", 1234567.123);
        System.out.printf("Формат чисел с плавающей точкой разделённый запятыми: %,f\n", 1234567.123);
        System.out.printf("Формат чисел с плавающей точкой по умолчанию: %f\n", -1234567.123);
        System.out.printf("Другой формат чисел с плавающей точкой: %,(f\n", -1234567.123);
        System.out.println();

        System.out.println("Выравние положительных и отрицательных числовых значений: ");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);
    }
}

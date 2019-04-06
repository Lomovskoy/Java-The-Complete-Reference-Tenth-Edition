package chapter3;

/**
 * Вычисление расстояния, проходимое светом,
 * используя переменные типа long
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
public class Light {

    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distanse;

        // Приблизительная скорость света в км/с.
        lightSpeed = 299792;
        // Колическтво дней
        days = 1000;
        // Преобразование дней в секунды
        seconds = days * 24 * 60 * 60;
        // Вычисляем расстояние
        distanse = lightSpeed * seconds;
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distanse + " миль.");
    }
}

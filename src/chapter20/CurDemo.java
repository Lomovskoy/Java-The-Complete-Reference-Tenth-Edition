package chapter20;

import java.util.Currency;
import java.util.Locale;

/**
 * Класс демонстрирующий применение
 * класса Currency.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class CurDemo {

    public static void main(String[] args) {

        Currency currency;
        currency = Currency.getInstance(Locale.US);

        System.out.println("Символ: " + currency.getSymbol());
        System.out.println("Количество цифр в дробной части " +
                "числа по умолчанию: " + currency.getDefaultFractionDigits());
    }
}

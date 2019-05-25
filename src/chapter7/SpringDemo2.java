package chapter7;

/**
 * Программа демонстрирующая,
 * некоторые методы класса String.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class SpringDemo2 {

    public static void main(String[] args) {

        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;

        System.out.println("Длинна строки strOb1: " + strOb1.length());
        System.out.println("Символ по индексу 3 строки strOb1 " + strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}

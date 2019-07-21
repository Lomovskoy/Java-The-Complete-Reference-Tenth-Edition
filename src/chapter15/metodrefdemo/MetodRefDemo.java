package chapter15.metodrefdemo;

/**
 * Класс демонстрирующий ссылку на
 * статический метод в лямбда-выражении.
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
class MetodRefDemo {

    /*
        В этом методе функциональный интерфейс указывается в качестве
        типа первого его параметра. Следовательно, ему модет быть передан
        любой экземпляр данного интерфейса, включая и ссылку на метод.
     */
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Лямбла-выражения повышают эффективность Java";
        String outStr;

        // Здесь ссылка на метод strReverse()
        // передаётся методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }
}

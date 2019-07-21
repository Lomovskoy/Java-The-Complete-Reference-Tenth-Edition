package chapter15.metodrefdemo2;

/**
 * Класс демонстрирующий ссылку на
 * статический метод в лямбда-выражении.
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
class MetodRefDemo2 {

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

        // Создать объект тима MyStringOps
        MyStringOps strOps = new MyStringOps();

        // Здесь ссылка на метод strReverse()
        // передаётся методу stringOp()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }
}

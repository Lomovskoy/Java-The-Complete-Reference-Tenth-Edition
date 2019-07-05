package chapter14.boundsdemo;

/**
 * Продемонстрировать применение класса Stats
 *
 * @author Ломовской К.Ю.
 * @since 05.07.2019
 */
class BoundsDemo {

    public static void main(String[] args) {

        Integer iNums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(iNums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно " + v);

        Double dNums[] = {1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dOb = new Stats<Double>(dNums);
        double w = dOb.average();
        System.out.println("Среднее значение dOb равно " + w);

        // Этот код не скомпилитуется, так как класс String
        // не является производным от класса Number
        //String strs[] = {"1", "2", "3", "4", "5"};
        //Stats<String> strOb = new Stats<String>(strs);
        //double x = strOb.average();
        //System.out.println("Среднее значение strOb равно " + x);
    }
}

package chapter7.overloaddemo2;

public class Overload2 {

    public static void main(String[] args) {

        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);             // Здесь выхыватся вариант метода test(double)
        ob.test(123.25);    // И здесь выхыватся вариант метода test(double)
    }
}

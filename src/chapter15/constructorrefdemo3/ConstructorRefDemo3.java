package chapter15.constructorrefdemo3;

/**
 * Класс демонстрирующий применение
 * ссылки на конструктор обобщённого класса.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class ConstructorRefDemo3 {

    /*
        Фабричный метод для объектов разных классов. У каждого класса должен быть свой конструктор,
        принимающий один параметр типа Т. А параметр R обозначает тип создаваемого объекта.
     */
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {

        MyFunc<MyClass<Double>, Double> myClassConsts = MyClass<Double>::new;

        MyClass<Double> mc = myClassFactory(myClassConsts, 100.1);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        MyFunc<MyClass2, String> myClassConsts2 = MyClass2::new;

        MyClass2 mc2 = myClassFactory(myClassConsts2, "Лямбда");

        System.out.println("Значение str в объекте mc равно " + mc2.getVal());
    }
}

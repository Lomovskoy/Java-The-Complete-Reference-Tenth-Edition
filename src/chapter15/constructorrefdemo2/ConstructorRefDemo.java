package chapter15.constructorrefdemo2;

/**
 * Класс демонстрирующий применение
 * ссылки на конструктор обобщённого класса.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class ConstructorRefDemo {

    public static void main(String[] args) {

        /*
            Создать сслку на конструктор обощённого класса MyClass. Метод func() из интерфейса MyFunc
            принимает аргумент, поэтому в операции new вызывается параметризованный конструктор класса
            MyClass, а не к его конструктор по умолчания
         */
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;

        // Создать эекземпляр обощённого класса MyClass по ссылке на его конструктор
        MyClass<Integer> mc = myClassCons.func(100);

        // Использовать только, что созданный экземпляр обощённого класса MyClass
        System.out.println("Значение val в обьекте mc равно " + mc.getVal());
    }
}

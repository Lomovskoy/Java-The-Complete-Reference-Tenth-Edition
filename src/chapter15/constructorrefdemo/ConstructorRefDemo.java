package chapter15.constructorrefdemo;

/**
 * Класс демонстрирующий применение ссылки на конструктор.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class ConstructorRefDemo {

    public static void main(String[] args) {

        /*
            Создать сслку на конструктор класса MyClass. Метод func() из интерфейса MyFunc принимает
            аргумент, поэтому в операции new вызывается параметризованный конструктор класса MyClass,
            а не к его конструктор по умолчания
         */
        MyFunc myClassCons = MyClass::new;

        // Создать эекземпляр класса MyClass по ссылке на его конструктор
        MyClass mc = myClassCons.func(100);

        // Использовать только, что созданный экземпляр класса MyClass
        System.out.println("Значение val в обьекте mc равно " + mc.getVal());
    }
}

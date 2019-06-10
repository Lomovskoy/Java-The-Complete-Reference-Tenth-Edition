package chapter9.iftest2;

/**
 * Программа демонстрирующая, реализацию
 * стека вызванного через интерфейс.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class IFTest3 {

    public static void main(String[] args) {

        // Создать переменную ссылки на интерфейс
        IntStack myStask;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        // Загрузить динамический стек
        myStask = ds;
        // Разместить числа в стеке
        for (int i = 0; i < 12; i++)
            myStask.push(i);

        // Загрузить фиксированный стек
        myStask = fs;
        for (int i = 0; i < 8; i++)
            myStask.push(i);

        myStask = ds;
        System.out.println("Значениыя в динамическом стеке");
        for (int i = 0; i < 12; i++)
            System.out.println(myStask.pop());

        myStask = fs;
        System.out.println("Значениыя в статическом стеке");
        for (int i = 0; i < 8; i++)
            System.out.println(myStask.pop());
    }
}

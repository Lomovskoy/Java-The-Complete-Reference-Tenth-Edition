package chapter7;

/**
 * Программа демонстрирующая, применение аргументоув переменной длинны и перегрузка методов
 * и неоднозначность. Эта программа содержит ошибку, по этому она не подлежит компиляции.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class VarArgs4 {

    static void vaTest(int ... v){
        System.out.print("vaTest(int ...): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean ...): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);            // Верно!
        vaTest(true, false, false); // Верно!
        //vaTest();                       // Ошибка: неоднозначность!
    }
}

package chapter10;

/**
 * Программа демонстрирующая, последовательность
 * catch подкласс исключений должен быть указан
 * перед его суперклассом, иначе это приведёт к
 * недосчтижимому коду и ошибке в овремя компиляции.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
class SuperSubCatch {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        }catch (Exception e){
            System.out.println("Перехват общего класса Exception.");
        }
        /* Этот оператор вообще не будет достигнут, так как подкласс
         * ArithmeticException является *производным от класса Exception
         */
//        catch (ArithmeticException e){
//            // Ошибка: недостижимый код
//            System.out.println("Этот код вообще не достижим");
//        }
    }
}

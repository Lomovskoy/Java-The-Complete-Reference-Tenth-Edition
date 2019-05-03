package chapter5;

/**
 * Программа демонстрирующая, оператора returm.
 *
 * @author Ломовской К.Ю.
 * @since 25.04.2019
 */
class Return {

    public static void main(String[] args) {

        boolean t = true;
        System.out.println("До возврата.");
        
        if (t) return; // возврат в вызывающицй код

        System.out.println("Этот оператор выполнятьсян не будет");
    }

}

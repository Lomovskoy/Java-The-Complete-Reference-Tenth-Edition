package chapter5;

/**
 * Программа демонстрирующая, отдельные части
 * оператора цикла for могут отсудствовать.
 *
 * @author Ломовской К.Ю.
 * @since 13.04.2019
 */
class ForVar {

    public static void main(String[] args) {

        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ){
            System.out.println("i раво " + i);
            if (i == 10) done = true;
            i ++;
        }
    }
}

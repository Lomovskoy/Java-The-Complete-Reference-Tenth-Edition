package chapter12;

/**
 * Программа демонстрирующая, автоупаковку и автораспаковку происходящую
 * при передачи переметров и возврате значения из методов.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
public class AutoBox2 {

    // Принять переметр типа Integer и возвратить значение типа int
    static int m(Integer v){
        // Автраспаковка значения типа int
        return v;
    }

    public static void main(String[] args) {
        /*
            Передать значение типа int методу m() и присвоить
            возвращаемое значение объекту типа Integer.
            Здесь значение 100 аргумента автоматически
            упаковывется в объекст типа Integer.
            Возвращаемое значение также упаковывается
            а обьект типа Integer.
         */
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}

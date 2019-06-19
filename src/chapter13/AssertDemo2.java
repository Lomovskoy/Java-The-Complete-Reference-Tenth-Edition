package chapter13;

/**
 * Программа демонстрирующая, неудачное
 * применение ключевого слова assert.
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class AssertDemo2 {

    static int val = 3;

    // Возвратить целочисленное значение
    static int getNum(){
        return val--;
    }

    public static void main(String[] args) {

        int n = 0;

        for (int i = 0; i < 10; i++){

            assert (n = getNum()) > 0;
            System.out.println("n is " + n);
        }
    }
}

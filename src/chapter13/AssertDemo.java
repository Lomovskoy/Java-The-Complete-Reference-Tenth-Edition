package chapter13;

/**
 * Программа демонстрирующая,
 * применение ключевого слова assert.
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class AssertDemo {

    static int val = 3;

    // Возвратить целочисленное значение
    static int getNum(){
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++){
            n = getNum();

            assert n > 0: "n отрицательное";   // Не подтвердится если n == 0

            System.out.println("n равно " + n);
        }
    }
}

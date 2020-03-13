package chapter28.phaserdemo2;

import java.util.concurrent.Phaser;

/**
 * В этой программе демонстрируется расширение класса MyParser
 * чтобы выполненно только определённое количество фаз.
 *
 * @author Ломовской К.Ю.
 * @since 13.03.2020
 */
public class MyParser extends Phaser {

    int numPhaser;

    public MyParser(int parties, int parsCount) {
        super(parties);
        this.numPhaser = parsCount;
    }

    // Переопределить метод onAdvance() таким образом, чтобы
    // было выполненно только определённое количество фаз.
    @Override
    protected boolean onAdvance(int p, int regParties) {
        // Следующий вызов метода println() требуется только
        // для целей иллюстрации. Как правило, метод
        // onAdvance() не отображает выводимые данные.
        System.out.println("Фаза " + p + " завершена.\n");

        // Возвратить логическое значение true,
        // если все фазы завершены инача возвращать
        // логическое значение false
        return p == numPhaser || regParties == 0;

    }
}

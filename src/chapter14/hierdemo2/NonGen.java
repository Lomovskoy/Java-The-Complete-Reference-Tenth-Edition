package chapter14.hierdemo2;

/**
 * Класс демонстрирующий, что не обощённый
 * класс может служить суперклассом для обощённого
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class NonGen {

    int num;

    NonGen(int i){
        num = i;
    }

    int getNum(){
        return num;
    }
}

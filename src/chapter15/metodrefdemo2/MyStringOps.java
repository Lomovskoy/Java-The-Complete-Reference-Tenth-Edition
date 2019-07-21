package chapter15.metodrefdemo2;

/**
 * Класс демонстрирующий определение
 * статического метода strReverse().
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
class MyStringOps {

    // Статический метод, изменяющий порядок
    // следования символов в строке
    String strReverse(String str){
        String result = "";
        int i;

        for (i = str.length()-1; i >=0; i--)
            result += str.charAt(i);

        return result;
    }
}

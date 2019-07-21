package chapter15.lambdaexceptiondemo;

/**
 * Класс кастомного исключения.
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Массив пуст.");
    }
}

package chapter10;

/**
 * Программа демонстрирующая,
 * применение оператора finally.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
class FinallyDemo {

    // Сгенерировать исключение в методе
    static void procA(){
        try {
            System.out.println("В методе procA()");
            throw new RuntimeException("Демонстрация");
        }finally {
            System.out.println("В операторе finally метода procA()");
        }
    }

    // Возвратить управление из блока оператора try
    static void procB(){
        try {
            System.out.println("В методе procB()");
            return;
        }finally {
            System.out.println("В операторе finally метода procB()");
        }
    }

    // Выполнить блок try как оыбчно
    static void procC(){
        try {
            System.out.println("В методе procC()");
        }finally {
            System.out.println("В операторе finally метода procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Исключение перехваченно");
        }

        procB();
        procC();
    }
}

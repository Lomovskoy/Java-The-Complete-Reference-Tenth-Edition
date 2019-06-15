package chapter12.askme;

/**
 * Программа демонстрирующая, усовершенствованную версию программы
 * принятия решений. В этой версии для представляния возможных
 * ответов используя перечисление, а не переменные экземпляра.
 *
 * @author Ломовской К.Ю.
 * @since 14.06.2019
 */
class AskMe {

    static void answer(Amswer result){

        switch (result){
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MABE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {

        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}

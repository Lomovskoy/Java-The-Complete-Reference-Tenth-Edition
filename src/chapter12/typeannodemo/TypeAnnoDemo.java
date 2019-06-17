package chapter12.typeannodemo;

/**
 * Программа демонстрирующая,
 * применение нескольких типов аннотаций.
 *
 * @author Ломовской К.Ю.
 * @since 17.06.2019
 */
class TypeAnnoDemo<@What(desctiption = "Данный обощённого типа") T> {

    // Применить типовую аннотацию в конструкторе
    public @Unique TypeAnnoDemo(){ }

    // Аннотировать тип (в данном случае - String), но не поле
    @TypeAnno String str;

    // Аннотировать ткст поля
    @EmptyOk String test;

    // Применить типовую аннотацию для аннотирования
    // ссылки this на объект (получатель)
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x){
        return 10;
    }

    // Аннотировать возвращаемый тип
    public @TypeAnno Integer f2(int j, int k){
        return j + k;
    }

    // Аннотировать объявление метода
    public @Recommended Integer f3(String str){
        return str.length() / 2;
    }

    // Применить типовую аннотацию в операторе throws
    public void f4() throws  @TypeAnno NullPointerException{
        // ...
    }

    // Аннотировать уровни доступа к массиву
    String @MaxLen(10) [] @NotZeroLen [] w;

    // Аннотировать тип элемента массива
    @TypeAnno Integer [] vac;

    public static void myMeth(int i) {

        // Применить типовую аннотацию в аргументе типа
        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();

        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = new Integer(10);
        Integer y;

        // Примсенить типовую аннотацию в приведении типов
        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }

    // Применить типовую аннотацию в выражении наследования
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean>{}
}

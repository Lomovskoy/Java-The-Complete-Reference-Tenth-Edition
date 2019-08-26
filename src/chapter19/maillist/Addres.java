package chapter19.maillist;

/**
 * Класс демонстрирующий пример
 * обработки спискапочтовых адресов.
 *
 * @author Ломовской К.Ю.
 * @since 26.08.2019
 */
class Addres {

    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Addres(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public String toString() {
        return name + '\n' + street + '\n' + city + ' ' +
                state + ' ' + code;
    }
}

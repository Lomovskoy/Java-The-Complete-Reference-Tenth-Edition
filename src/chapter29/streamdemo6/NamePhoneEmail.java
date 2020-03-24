package chapter29.streamdemo6;

/**
 * Этот класс данных содержит
 * номер телефона, имя и адрес почты.
 *
 * @author Ломовской К.Ю.
 * @since 24.03.2020
 */
public class NamePhoneEmail {

    String name;
    String phoneNum;
    String email;

    public NamePhoneEmail(String n, String p, String e) {
        this.name = n;
        this.phoneNum = p;
        this.email = e;
    }
}

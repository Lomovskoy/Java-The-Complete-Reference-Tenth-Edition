package chapter38;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * В этой программе демонстрируются
 * использование Cookie.
 *
 * @author Ломовской К.Ю.
 * @since 05.05.2020
 */
public class AddCookieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Получить параметр из Http запроса
        String data = req.getParameter("data");

        // Создать cookie-файл
        Cookie cookie = new Cookie("MyCookie", data);

        // Ввести cookie-файл в Http ответ
        resp.addCookie(cookie);

        // Вывести результат в окне браузера
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<B>MyCookie has been set to: ");
        pw.println(data);
        pw.close();
    }
}

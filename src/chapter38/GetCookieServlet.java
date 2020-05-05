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
public class GetCookieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Получить cookie-файлы из Http запроса
        Cookie[] cookies = req.getCookies();

        // Вывести все cookie-файлы
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            pw.println("name = " + name + "; value = " + value);
        }
        pw.close();
    }
}

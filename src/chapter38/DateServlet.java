package chapter38;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * В этой программе демонстрируются
 * использование сеанса связи.
 *
 * @author Ломовской К.Ю.
 * @since 05.05.2020
 */
public class DateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Получить объекст типа HttpSession
        HttpSession hs = req.getSession(Boolean.TRUE);

        // Получить поток записи типа PrintWriter
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        // Вывести дату и время последнего доступа к странице
        Date date = (Date) hs.getAttribute("date");
        if (date != null)
            pw.println("Last access: " + date + "<br>");

        // Вывечти текущую дату и время
        date = new Date();
        hs.setAttribute("date", date);
        pw.println("Current date: " + date);
    }
}

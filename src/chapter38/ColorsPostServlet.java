package chapter38;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * В этой программе демонстрируются
 * обработка Http запроса POST.
 *
 * @author Ломовской К.Ю.
 * @since 05.05.2020
 */
public class ColorsPostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<B>The selected color is: ");
        pw.println(color);
        pw.close();
    }
}

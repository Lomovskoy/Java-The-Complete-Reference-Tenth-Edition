package chapter38;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * В этой программе демонстрируются
 * применение сервлета.
 *
 * @author Ломовской К.Ю.
 * @since 05.05.2020
 */
public class HelloServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>Я тебя люблю моя зайка - твой мягкишек!");
        pw.close();
    }
}

package chapter38;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>Я тебя люблю моя зайка - твой мягкишек!");
        pw.close();
    }
}

package chapter38;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * В этой программе демонстрируются
 * применение пост метода сервлета.
 *
 * @author Ломовской К.Ю.
 * @since 05.05.2020
 */
public class PostParametrsServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        // Получить поток записи типа PrintWriter
        PrintWriter pw = response.getWriter();

        // Получить перечисление имен параметров
        Enumeration e = request.getParameterNames();

        // Выввчсти имена параметров и их значение
        while (e.hasMoreElements()){
            String pname = (String) e.nextElement();
            pw.println(pname + " = ");
            String pvalue = request.getParameter(pname);
            pw.println(pvalue);
        }
        pw.close();
    }
}

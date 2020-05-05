package chapter38;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class PostParametrsServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        PrintWriter pw = response.getWriter();

        Enumeration e = request.getParameterNames();

        while (e.hasMoreElements()){
            String pname = (String) e.nextElement();
            pw.println(pname + " = ");
            String pvalue = request.getParameter(pname);
            pw.println(pvalue);
        }
        pw.close();
    }
}

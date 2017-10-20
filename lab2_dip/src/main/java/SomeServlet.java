import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String str="";
        str=str+Math.random()*10;
        httpServletRequest.setAttribute("age", str);

        httpServletRequest.getRequestDispatcher("/main").forward(httpServletRequest, httpServletResponse);
    }
}

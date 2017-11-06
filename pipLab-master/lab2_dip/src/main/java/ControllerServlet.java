import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ControllerServlet")
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("R") == null || request.getParameter("Y") == null
                || request.getParameter("X") == null ){
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + "There is lack of parameters" + "</title>");
            out.println("</head>");
            out.println("<body bgcolor='white'>");
            out.println("<h3>" + "There is lack of parameters" + "</h3>");
            out.println("<p>");
            out.println("You should fill all forms");
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
        }
        else if (!isParameterInteger(request.getParameter("R"))
                || !isParameterDouble(request.getParameter("X"))
                || !isParameterDouble(request.getParameter("Y")) ){
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + "Parameters should be numbers" + "</title>");
            out.println("</head>");
            out.println("<body bgcolor='white'>");
            out.println("<h3>" + "Parameters should be numbers" + "</h3>");
            out.println("<p>");
            out.println("You should use numbers as coordinates");
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
        } else if (Integer.parseInt(request.getParameter("R"))<1
                || Integer.parseInt(request.getParameter("R"))>5
                || Double.parseDouble(request.getParameter("X"))<-6.5
                || Double.parseDouble(request.getParameter("X"))>6.5
                || Double.parseDouble(request.getParameter("Y"))<-6.5
                || Double.parseDouble(request.getParameter("Y"))>6.5 ){
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + "Out of limits" + "</title>");
            out.println("</head>");
            out.println("<body bgcolor='white'>");
            out.println("<h3>" + "Out of limits" + "</h3>");
            out.println("<p>");
            out.println("X has to be from -6 to 6");
            out.println("</p>");
            out.println("<p>");
            out.println("Y has to be from -6 to 6");
            out.println("</p>");
            out.println("<p>");
            out.println("R has to be from 1 to 5 and should be integer");
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
        }
        else {
            request.getRequestDispatcher("/result").forward(request, response);
        }
    }

    private static boolean isParameterDouble(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean isParameterInteger(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

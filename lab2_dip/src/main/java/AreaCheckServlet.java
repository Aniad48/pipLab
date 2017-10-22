import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AreaCheckServlet")
public class AreaCheckServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Try>  listOfTries= new ArrayList<Try>();
        int r = Integer.parseInt(request.getParameter("R"));
        int x = Integer.parseInt(request.getParameter("X"));
        int y = Integer.parseInt(request.getParameter("Y"));
        String result = new String();

        if (x<=0 & y<=0 & x>=-r & y>=-r/2 ){
            result="Попали";
        }
        else if(x>=0 & y<=0 & x<=r & y>=-r/2 & y>=(1/2)*x-r/2 ){
            result="Попали";
        }
        else if(x>=0 & y>=0 & x<=r/2 & y<=r/2 & y*y+x*x<=r*r){
            result="Попали";
        }
        else result="Промахнулись";

        HttpSession se = request.getSession();
        if (se.isNew()){
            listOfTries.clear();
        }
        else {
            listOfTries = (ArrayList<Try>)se.getAttribute("listOfTries");
        }
        Try currentTry = new Try(x,y,r,result);
        listOfTries.add(currentTry);
        se.setAttribute("listOfTries", listOfTries);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>" + "Results" + "</title>");
        out.println("</head>");
        out.println("<body bgcolor='white'>");
        out.println("<table>");
        out.println("<tr><td colspan=\"3\">Полученные параметры</td></tr>");
        out.println("<tr>");
        out.println("<td>X</td>");
        out.println("<td>Y</td>");
        out.println("<td>R</td>");
        out.println("</tr>");

        for (Try tr : listOfTries){
            out.println("<tr>");
            out.println("<td>"+tr.getX()+"</td>");
            out.println("<td>"+tr.getY()+"</td>");
            out.println("<td>"+tr.getR()+"</td>");
            out.println("<td>"+tr.getResult()+"</td>");
            out.println("</tr>");
        }

        out.println("<tr>");
        out.println("<td>"+y+"</td>");
        out.println("<td>"+x+"</td>");
        out.println("<td>"+r+"</td>");
        out.println("<td>"+result+"</td>");
		out.println("</tr>");
		out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}

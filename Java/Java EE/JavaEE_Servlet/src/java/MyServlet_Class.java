//  MANEJAR LOS DATOS EN EL SERVLET
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="MyServlet_Class", urlPatterns="/MyServlet_Class")
public class MyServlet_Class extends HttpServlet{
    
    
    //  Metodos doGet y doPost
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyServlet at " + req.getContextPath() + "</h1>");
            out.println("Hola , Bienvenido a mi clase Servlet\n");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        
        //  Recibiendo los datos del formulario
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        String sexo = req.getParameter("sexo");
        String pais = req.getParameter("pais");
        String[] language = req.getParameterValues("language");
        
        
        try(PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Hola , Bienvenido a mi clase Servlet\n");
            out.println("User: "+user);
            out.println("Password: "+password);
            out.println("Sexo: "+sexo);
            out.println("Pais: "+pais);
            //  Language
            for(String l:language){
                out.println("Language: "+l);
            }
            out.println("");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    
}

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.jni.Directory;

/**
 *
 * @author Suraj
 */
public class FileName extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        String path="C:\\Users\\hp\\Desktop\\Suraj_Jain\\Worldpay_java\\sept17\\ServletDayOne\\files";
        File f= new File(path);
        File[] listFiles = f.listFiles();
        //out.println(listFiles.length);
        out.println("<html>");
        out.println("<head>");
        out.println("<title>AVALIABLE BOOK</title>");
        out.println("</head>");
        out.println("<body>");
        for(File temp:listFiles){
            
            out.println("<a href=\"IndividualFile?book="+temp.getName()+"&path="+path+"\">"+temp.getName()+"</a><br>");
        }
        
        out.println("<form action=\"IndividualFile\">");
        out.println("<input value =\""+path+"\" name=\"path\" hidden=\"hidden\">");
        out.println("<select name=\"book\">");
        for(File temp:listFiles)
            out.println("<option>"+temp.getName()+"</option>");
        
        out.print("</select>");
        out.println("<input type=\"submit\" value =\"submit\" name=\"path\">");
        out.println("</form>");
        
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

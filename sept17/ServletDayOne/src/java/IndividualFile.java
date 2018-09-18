
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suraj jain
 */
public class IndividualFile extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        try{
            String ext=request.getParameter("book").substring(request.getParameter("book").indexOf("."),request.getParameter("book").length());
            File f =new File(request.getParameter("path")+"\\"+request.getParameter("book"));
            if(ext.equals(".txt"))
                response.setContentType("text/plain");
            else if (ext.equals(".docx"))
                response.setContentType("application/msword");
            else if(ext.equals(".pdf"))
                response.setContentType("application/pdf");
            FileInputStream fin=new FileInputStream(f);
            byte b[]=new byte[fin.available()];
            fin.read(b);
            //PrintWriter out = response.getWriter()
            //out.println("ashdf");
            //out.println("asdgndlasbigb");
           // out.write(new String(b));          
            ServletOutputStream sout=response.getOutputStream();
            sout.write(b);            
            sout.close();
            
            
        }
        catch(Exception e){
            
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
        processRequest(request, response);
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

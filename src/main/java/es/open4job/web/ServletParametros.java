package es.open4job.web;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.open4job.aytozgz.opendata.model.dao.AparcamientosPublicosDAO;

/**
 * Servlet implementation class ServletParametros
 */
public class ServletParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletParametros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String id= request.getParameter("id");
		AparcamientosPublicosDAO objAparcamiento= new AparcamientosPublicosDAO();
        
        out.println("<html>");
		out.println("<body>");
		try {
			
			out.println("<h1> Hola amigos!!! ");//+ objAparcamiento.getListadoAparcamientos(Integer.parseInt(id)) + "</h1>");
			request.setAttribute("identi",(Object)objAparcamiento.getListadoAparcamientos(Integer.parseInt(id)));
			request.getRequestDispatcher("PasarParametro.jsp").forward(request, response);
	
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/*catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

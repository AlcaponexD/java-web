package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/hmml;charset=UTF-8");
		
		try (PrintWriter out = response.getWriter()){
			out.println("<h2>Olá</h2>");
			out.println("<h2>Sua soma é : </h2>");
			
			double n1 = Double.parseDouble(request.getParameter("n1"));
			double n2 = Double.parseDouble(request.getParameter("n2"));
			
			double sum = n1+n2;
			
			out.println("<h2>Sua soma é "+sum+"</h2>");
			
			try {
				
			}catch (Exception e) {
				out.println("<h3>Ocorreu um erro nos parametros :"+e.getMessage()+"</h3>");
			}
			
				
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

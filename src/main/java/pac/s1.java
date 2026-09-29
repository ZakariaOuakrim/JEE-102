package pac;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public s1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		if (userName == null || userName.trim().isEmpty()) {
			userName = "Guest";
		}
		
		//create the session 
		HttpSession session = request.getSession();
		session.setAttribute("name", userName);
		String userNameFromSession = (String) session.getAttribute("name");
		
		
		// Redirect to suite.jsp to show the session variable
		response.sendRedirect("suite.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

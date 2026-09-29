package ntier.controller;

import ntier.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/debut")
public class DebutController extends HttpServlet {
    private UserService userService;

    @Override
    public void init() {
        userService = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Fetch data from the database
        Object users = userService.getAllUsers();
        
        // Add the data to the session
        HttpSession session = request.getSession();
        session.setAttribute("users", users);
        
        // Forward to the debut.jsp
        request.getRequestDispatcher("/debut.jsp").forward(request, response);
    }
}

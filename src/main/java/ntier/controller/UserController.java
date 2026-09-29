package ntier.controller;

import ntier.model.User;
import ntier.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users")
public class UserController extends HttpServlet {
    private UserService userService;

    @Override
    public void init() {
        userService = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "new":
                request.getRequestDispatcher("/user-form.jsp").forward(request, response);
                break;
            case "confirmDelete":
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("user", userService.getUser(id));
                request.getRequestDispatcher("/user-delete.jsp").forward(request, response);
                break;
            case "list":
            default:
                request.setAttribute("users", userService.getAllUsers());
                request.getRequestDispatcher("/user-list.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("insert".equals(action)) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            userService.addUser(new User(username, password));
            response.sendRedirect("users?action=list");
        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            userService.deleteUser(id);
            response.sendRedirect("users?action=list");
        }
    }
}

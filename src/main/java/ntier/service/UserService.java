package ntier.service;

import ntier.dao.UserDao;
import ntier.dao.UserDaoImpl;
import ntier.model.User;
import java.util.List;

public class UserService {
    private UserDao userDao = new UserDaoImpl();

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public User getUser(int id) {
        return userDao.findUser(id);
    }

    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}

package ntier.dao;
import ntier.model.User;
import java.util.List;

public interface UserDao {
    void addUser(User user);
    User findUser(int id);
    List<User> findAllUsers();
    void deleteUser(int id);
}

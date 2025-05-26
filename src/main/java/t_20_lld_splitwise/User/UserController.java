package t_20_lld_splitwise.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUser(String userID) {
        return userList.stream().filter(user -> user.userId.equals(userID))
                .findFirst().orElse(null);
    }
}

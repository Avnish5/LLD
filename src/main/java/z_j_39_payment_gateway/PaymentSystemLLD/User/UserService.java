package z_j_39_payment_gateway.PaymentSystemLLD.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService {

    static List<User> userList = new ArrayList<>();

    public UserDO addUser(UserDO userDO) {
        User user = new User();
        user.setUserName(userDO.getName());
        user.setEmail(userDO.getMail());
        user.setUserID((int) new Random().nextInt(100-10)+10);
        userList.add(user);

        return convertUserToUserDO(user);
    }

    public UserDO getUser(int userId) {
        for(User user : userList) {
            if (user.getUserID() == userId) {
                return convertUserToUserDO(user);
            }
        }

        return null;
    }

    private  UserDO convertUserToUserDO(User userObj) {
        UserDO userDO = new UserDO();
        userDO.setName(userObj.getUserName());
        userDO.setUserID(userObj.userID);
        userDO.setMail(userObj.getEmail());
        return userDO;
    }
}

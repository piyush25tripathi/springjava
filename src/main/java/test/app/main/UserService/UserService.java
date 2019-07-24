package test.app.main.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {


    private List<User> list = Arrays.asList(
            new User("1", "Piyush"),
            new User("2", "Pawan"),
            new User("3", "Ritendra"),
            new User("4", "Ankit")
    );

    public List<User> getAllUsersDetail(){
        return list;
    }

    public void addUser(User newUser) {
        list.add(new User(newUser.userId, newUser.userName));
    }
}

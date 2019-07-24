package test.app.main.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/getAllUsers", method = RequestMethod.GET)
    public List<User> getDetails() {
        return userService.getAllUsersDetail();
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User newUser) {
        userService.addUser(newUser);
    }
}

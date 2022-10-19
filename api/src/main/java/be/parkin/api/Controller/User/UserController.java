package be.parkin.api.Controller.User;

import be.parkin.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // GET users
    @GetMapping("api/users/")
    public String getAllUsers(){
        return "GET all users";
    }
    // GET user by id
    @GetMapping("api/users/${id}")
    public String getUserById(){
        return "GET user by id";
    }

    // GET user by username
    @GetMapping("api/users/${username}")
    public String getUserByUsername(){
        return "GET user by username";
    }

    // POST user

    // UPDATE user

    // DELETE user
}

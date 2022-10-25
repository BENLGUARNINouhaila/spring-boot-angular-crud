package CRUD.example.crude_backend.Controller;

import CRUD.example.crude_backend.Entity.User;
import CRUD.example.crude_backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/crud/")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    //get all users
    @GetMapping("/Users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}

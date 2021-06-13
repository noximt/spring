package by.rest.resource;

import by.rest.entity.User;
import by.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(produces = "application/json")
    public void save(@RequestBody User user){
        userRepository.save(user);
    }
}

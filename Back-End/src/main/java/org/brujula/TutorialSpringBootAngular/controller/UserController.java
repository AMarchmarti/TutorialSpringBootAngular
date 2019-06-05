package org.brujula.TutorialSpringBootAngular.controller;

import org.brujula.TutorialSpringBootAngular.entities.User;
import org.brujula.TutorialSpringBootAngular.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> listUser() {
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User user(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/user/{id}")
    public boolean delete(@PathVariable Long id) {
        userService.deleteUser(id);
        return true;
    }

    @PutMapping("/user")
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @PostMapping("/user")
    public User create(@RequestBody User user) {
        return userService.createUser(user);
    }
}
package org.brujula.TutorialSpringBootAngular.service;

import org.brujula.TutorialSpringBootAngular.entities.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUser(Long id);

    void deleteUser(Long id);

    User updateUser(User user);

    User createUser(User user);
}

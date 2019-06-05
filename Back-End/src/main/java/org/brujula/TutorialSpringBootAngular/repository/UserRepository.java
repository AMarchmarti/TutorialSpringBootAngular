package org.brujula.TutorialSpringBootAngular.repository;

import org.brujula.TutorialSpringBootAngular.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}



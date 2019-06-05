package org.brujula.TutorialSpringBootAngular.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fname;
    private String lname;

    public User(){}

    public User(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
}
